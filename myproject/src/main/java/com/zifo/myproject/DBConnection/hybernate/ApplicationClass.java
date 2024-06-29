package com.zifo.myproject.DBConnection.hybernate;

import java.util.logging.Level;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zifo.myproject.DBConnection.pojo.EmpDetail;

public class ApplicationClass {

	public static void main(String[] args) {
	
		HybernateMappingUtil mappingUtil = new HybernateMappingUtil();
		EmpDetail empdetail = mappingUtil.getEmpDetail();
		HybernateUtil hibernateUtil = new HybernateUtil();
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
		Transaction transaction = null;
		
		try {
			 transaction = session.beginTransaction();
			  new EmpDetailDao().deleteByID("901", session);
		 transaction.commit();
		 session.close();
		 System.out.println("completed");
 
		}
		catch (Throwable e) {
		
			 e.printStackTrace();
		}

	}

}
