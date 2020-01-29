package com.hibernate;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class Main {

	public static void main(String[] args) 
	{
		Student s=null;
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		String sql="DELETE FROM Student WHERE id=104";
		Query query=session.createQuery(sql);
		int row=query.executeUpdate();
		if(row==0)
		System.out.println("does not deleted any row");
		else
		System.out.println("deleted row:"+row);
		
		
	}
		

}
