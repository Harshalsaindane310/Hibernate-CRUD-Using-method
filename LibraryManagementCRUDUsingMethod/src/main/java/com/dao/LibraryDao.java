package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.entities.Library;

public class LibraryDao {

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int BookNo = 2;
		Library l = ss.get(Library.class, BookNo);
		
		l.setBookName("Haripaat");
		l.setAuthor("Sant Dhnyneshower Maharar");
		l.setCategory("Aabhang");
		
		ss.merge(l);
		
		tr.commit();
		ss.close();
		
		System.out.println("Library Data Is Updated...!");

	}

	public void setData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Library l = new Library();
		l.setAuthor("Joshua Bloch");
		l.setBookName("Java");
		l.setCategory("Coding");
		
		ss.persist(l);
		tr.commit();
		ss.close();
		System.out.println("Library Data Insertesd.....!!");
	}

	public void daleteData() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int BookId = 4;
		Library l = ss.get(Library.class, BookId);
		
		ss.remove(l);
		tr.commit();
		ss.close();
		System.out.println("Library Data Remove....");
		
	}

}
