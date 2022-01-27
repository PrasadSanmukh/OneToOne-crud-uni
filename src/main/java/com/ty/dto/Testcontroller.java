package com.ty.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dao.Testdao;
import com.ty.shop.Invoice;
import com.ty.shop.Item;

public class Testcontroller {
	public static void main(String[] args) {
		


	/* EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Prasad");
	 EntityManager entityManager=entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction=entityManager.getTransaction();
	 entityTransaction.begin(); */
		Testdao td=new Testdao();
	 Item it=new Item();
	 it.setId(12);
	 it.setName("pen");
	 it.setCost(20);
	 
	 Invoice in=new Invoice();
	 in.setId(1);
	 in.setName("pen");
	 in.setBilligadress("bgr");
	 in.setGstNumber("TY-65666");
	 in.setTax(12000.00);
	 in.setItem(it);
	 
	 Item it1=new Item();
	 it1.setId(13);
	 it1.setName("book");
	 it1.setCost(50);
	 
	 Invoice in1=new Invoice();
	 in1.setId(3);
	 in1.setName("bag");
	 in1.setBilligadress("bgr");
	 in1.setGstNumber("TY-65666");
	 in1.setTax(12000.00);
	 in1.setItem(it1);
	// td.save(it,in);
	// td.save(it1,in1);
	// td.update(in1);
	 //td.delet(3);
	 td.getDetails(1);
}
}