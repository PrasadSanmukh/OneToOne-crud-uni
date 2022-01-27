package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.shop.Invoice;
import com.ty.shop.Item;

public class Testdao {

	EntityManagerFactory entityManagerfactory = null;
	EntityTransaction entityTransaction = null;

	private EntityManager getentityManager() {
		entityManagerfactory = Persistence.createEntityManagerFactory("Prasad");
		EntityManager entitymanager = entityManagerfactory.createEntityManager();
		return entitymanager;
	}

	public void save(Item item, Invoice invoice) {
		EntityManager entitymanager = getentityManager();
		entityTransaction = entitymanager.getTransaction();
		entityTransaction.begin();
		entitymanager.persist(item);
		entitymanager.persist(invoice);
		entityTransaction.commit();
	}

	public void update(Invoice invoice) {
		EntityManager entitymanager = getentityManager();
		entityTransaction = entitymanager.getTransaction();
		entityTransaction.begin();
		entitymanager.merge(invoice);
		entityTransaction.commit();
	}

	public void delet(int id) {
		EntityManager entitymanager = getentityManager();
		entityTransaction = entitymanager.getTransaction();
		Invoice invoice = entitymanager.find(Invoice.class, id);
		if (invoice != null) {
			entityTransaction.begin();
			entitymanager.remove(invoice);
			entityTransaction.commit();
		}
	}

	public Invoice getDetails(int id) {
		EntityManager entitymanager = getentityManager();
		entityTransaction = entitymanager.getTransaction();
		Invoice invoice = entitymanager.find(Invoice.class, id);

		return invoice;
	}
}