package pack;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

	public static void main(String[] args)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationcontext.xml");
		studentDao s=(studentDao)ap.getBean("s");
		int count=s.savestudent(new student(104,"hari"));
		List<student> list=s.getAllstudent();
		for(student e:list)
			System.out.println(e);
		//int count=s.updatestudent(new student(101,"shanthi"));
		//int count=s.deletestudent(new student(104));
		//System.out.println(count+" rows updated");
	}

}
