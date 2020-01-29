package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Student s=new Student();
		s.setId(106);
		s.setName("sha");
		session.save(s);
		t.commit();
		System.out.println("inserted");
	}

}
