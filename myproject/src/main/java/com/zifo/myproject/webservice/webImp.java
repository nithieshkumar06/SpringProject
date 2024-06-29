package com.zifo.myproject.webservice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.zifo.myproject.DBConnection.hybernate.EmpDetailDao;
import com.zifo.myproject.DBConnection.hybernate.HybernateMappingUtil;
import com.zifo.myproject.DBConnection.hybernate.HybernateUtil;
import com.zifo.myproject.DBConnection.pojo.EmpDetail;
@Service
public class webImp {
	
	
	
	HybernateMappingUtil mappingUtil = new HybernateMappingUtil();
	EmpDetail empdetail = mappingUtil.getEmpDetail();
	HybernateUtil hibernateUtil = new HybernateUtil();
	SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
    
public void addEmploye(EmpDetail employe) {
	Session session = sessionFactory.openSession();
    Transaction transaction = null;
	
	try {
		 transaction = session.beginTransaction();
		  new EmpDetailDao().merge(employe, session);
	 transaction.commit();
	 session.close();
	 System.out.println("completed");

	}
	catch (Throwable e) {
	
		 e.printStackTrace();
	}
	finally {
		
			
			if (session.isOpen()) {
			session.close();
			
		}
	}
}

public EmpDetail findEmploye(String employeID) {
	Session session = sessionFactory.openSession();
    Transaction transaction = null;
    EmpDetail employe = null;
	try {
		 transaction = session.beginTransaction();
		  employe = new EmpDetailDao().findById(employeID, session);
	 transaction.commit();
	 session.close();
	 System.out.println("completed");

	}
	catch (Throwable e) {
	
		 e.printStackTrace();
	}
	finally {
		
		
		if (session.isOpen()) {
		session.close();
		
	}
}
	return employe;
}
public void deleteEmployee(String employeID) {
    
    Transaction transaction = null;
    Session session = sessionFactory.openSession();
	try {
		 transaction = session.beginTransaction();
		   new EmpDetailDao().deleteByID(employeID, session);
	 transaction.commit();
	 session.close();
	 System.out.println("completed");

	}
	catch (Throwable e) {
	
		 e.printStackTrace();
	}
	finally {
		
	
		if (session.isOpen()) {
		session.close();
		
	}
}
}

public void updateEmploye(EmpDetail newEmployee) {
	Session session = sessionFactory.openSession();
    Transaction transaction = null;
	
	try {
		 transaction = session.beginTransaction();
		  new EmpDetailDao().update(newEmployee, session);
	 transaction.commit();
	 session.close();
	 System.out.println("completed");

	}
	catch (Throwable e) {
	
		 e.printStackTrace();
	}
	finally {
		
			
			if (session.isOpen()) {
			session.close();
			
		}
	}
	
}
}
