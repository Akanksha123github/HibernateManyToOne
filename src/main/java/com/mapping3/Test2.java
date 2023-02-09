package com.mapping3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {

	public static void main(String[] args) {
		
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				SessionFactory sessionFactory = cfg.buildSessionFactory();
				
				
				Session session = sessionFactory.openSession();
				
				Answer answer = (Answer) session.get(Answer.class, 3);
				System.out.println("Answer>> "+answer.getAns()+"  Question>> "+answer.getQuestion());
				
				session.update(answer);
				session.close();
				System.out.println(" Record Fetched Successfully");
			}


	}


