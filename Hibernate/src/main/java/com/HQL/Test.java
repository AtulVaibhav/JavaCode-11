package com.HQL;

public class Test {

	public static void main(String[] args) {
//		Product p1 = new Product();
//		p1.setProductName("HP-123");
//		p1.setCategory("Laptop");
//        p1.setProductPrice(67000);
//        
//        Product p2 = new Product();
//		p2.setProductName("Dell-123");
//		p2.setCategory("Laptop");
//        p2.setProductPrice(87000);
//        
//        Product p3 = new Product();
//		p3.setProductName("Iphone-15");
//		p3.setCategory("Mobile");
//        p3.setProductPrice(150000);
//        
//        Product p4 = new Product();
//		p4.setProductName("Hp-345");
//		p4.setCategory("Laptop");
//        p4.setProductPrice(97000);
//        
//        HQLUtil.addProduct(p1);
//        HQLUtil.addProduct(p2);
//        HQLUtil.addProduct(p3);
//        HQLUtil.addProduct(p4);
		
//		for(Product p:HQLUtil.getAllProducts()){
//			System.out.println(p.getProductId()+" "
//		            +p.getProductName()+" "+p.getCategory()+" "
//					+p.getProductPrice());	
//		}
		
//		
//		Product p = HQLUtil.getProductById(1);
//		System.out.println(p.getProductName());
		
		//HQLUtil.updateProduct(1, 70000);
		//HQLUtil.deleteProduct(4);
		
		
		
		for(Product p:HQLUtil.pagination()){
			System.out.println(p.getProductId()+" "
		            +p.getProductName()+" "+p.getCategory()+" "
					+p.getProductPrice());	
		}
		
		
		
		
		
		
		
	}

}
