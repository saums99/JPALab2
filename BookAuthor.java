package com.abc.labEx;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookAuthor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager entityManager = factory.createEntityManager();
		
		Book book1=new Book();
		book1.setISBN(100);
		book1.setPrice(1000);
		book1.setTitle("Beloved");
		
		Book book2=new Book();
		book2.setISBN(101);
		book2.setPrice(1500);
		book2.setTitle("Things Fall Apart");
		
		Author author1=new Author();
		author1.setId(1);
		author1.setName("Toni Morrison");
		
		author1.addBook(book1);
		author1.addBook(book2);
		
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		
		entityManager.persist(author1);
		
		System.out.println("Added author along with book details to database.");

		txn.commit();
		entityManager.close();		
		factory.close();
		}

}
