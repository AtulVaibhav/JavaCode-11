package com.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLUtil {
	private static SessionFactory factory = null;
   private static SessionFactory getSessionFactory(){
	  if(factory==null){
		  factory = new Configuration().configure().buildSessionFactory();  
	  }
	  return factory;
	  
   }
   
   //insert operation
   public static void addProduct(Product product){
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   session.save(product);
	   session.getTransaction().commit();
	   session.close();
	   System.out.println("Product saved successfully");
   }
   
   //get all products
   public static List<Product> getAllProducts(){
	   String hql = "from Product";
	   Session session = getSessionFactory().openSession();
	   Query<Product> query = session.createQuery(hql);
	   return query.list();
	   
   }
   
   //get product based on id
   public static Product getProductById(int id){
	   String hql = "from Product as p where p.productId=:productId";
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   Query<Product> query = session.createQuery(hql);
	   query.setInteger("productId", id);
	   session.getTransaction().commit();
	   return query.getSingleResult();
   }
   
   //update product
   
   public static void updateProduct(int productId,double productPrice){
	   String hql = "update Product as p set p.productPrice=:price where p.productId=:id";
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   Query<Product> query = session.createQuery(hql);
	   query.setDouble("price", productPrice);
	   query.setInteger("id", productId);
	   int i = query.executeUpdate();
	   session.getTransaction().commit();
	   if(i>0){
		   System.out.println("Product updated successfully");
	   }else{
		   System.out.println("Something went wrong");
	   }
   }
   //delete product
   public static void deleteProduct(int productId){
	   String hql = "delete from Product where productId=:id";
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   Query<Product> query = session.createQuery(hql);
	   query.setInteger("id", productId);
	   int i = query.executeUpdate();
	   session.getTransaction().commit();
	   if(i>0){
		   System.out.println("Product deleted successfully");
	   }else{
		   System.out.println("Something went wrong");
	   }   
   }
   
   //pagination 
   public static List<Product> pagination(){
	   String hql = "from Product";
	   Session session = getSessionFactory().openSession();
	   Query<Product> query = session.createQuery(hql);
	   query.setFirstResult(0);
	   query.setMaxResults(2);
	   return query.list();
   }
   
   
   
   
   
   
   
}
