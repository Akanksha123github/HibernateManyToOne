package com.mapping3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Question que = new Question();
		que.setQuestion("What is Java");
		
		Answer ans = new Answer();
		ans.setAns("Compiler");
		ans.setQuestion(que);
		
		Answer ans1 = new Answer();
		ans1.setAns("Markup Language");
		ans1.setQuestion(que);
		
		Answer ans2 = new Answer();
		ans2.setAns("Programming Language");
		ans2.setQuestion(que);
		
		session.save(que);
		session.save(ans);
		session.save(ans1);
		session.save(ans2);
		
		
		transaction.commit();
		session.close();
		System.out.println("Successfully added");
		
		

	}

}
