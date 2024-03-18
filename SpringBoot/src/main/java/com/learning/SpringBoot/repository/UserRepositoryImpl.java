package com.learning.SpringBoot.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.learning.SpringBoot.entity.User;

@Repository
public class UserRepositoryImpl {
	static List<User> list = new ArrayList<>();
	
	static{
		User u1 = new User(101,"Ankit","ankit@gmail.com");
		User u2 = new User(102,"Harsh","harsh@gmail.com");
		User u3 = new User(103,"Vivek","vivek@gmail.com");
		User u4 = new User(104,"Vishal","vishal@gmail.com");
		User u5 = new User(105,"Rohit","rohit@gmail.com");
		User u6= new User(106,"Vishnu","vishnu@gmail.com");
		
	   list.add(u1);
	   list.add(u2);
	   list.add(u3);
	   list.add(u4);
	   list.add(u5);
	   list.add(u6);
	   	
	}
	
	public List<User> getAll(){
		return list;
	}
	
	public User getUserById(int id){
		return list.stream().filter(obj->obj.getUserId()==id).findFirst().get();
	}
	
	public User addUser(User newUser){
		list.add(newUser);
		return newUser;
	}
	
	public String updateUser(int userId, User updateUser){
		User storedUser = list.stream().filter(obj->obj.getUserId()==userId)
				.findAny().get();
		if(storedUser==null){
			return "User Not found";
		}
		storedUser.setUserName(updateUser.getUserName());
		storedUser.setEmail(updateUser.getEmail());
		return "User updated successfully";
	}
	
	public String deleteUser(int id){
		User storedUser = list.stream().filter(obj->obj.getUserId()==id)
				.findAny().get();
		if(storedUser==null){
			return "User Not found";
		}
		list.remove(storedUser);
		return "User deleted successfully";
	}
	
	
	
	
	
	
	

}
