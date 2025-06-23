package com.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class libraryMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Library.class);
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Library l = new Library();
		l.setBookName("python");
		l.setCategory("Codding");
		l.setAuthor("mayur mali");
	
		
		ss.persist(l);
		tr.commit();
		ss.close();
		
		System.out.println("Data Is inserted......!!");
		
		
	}

}
