package com.zifo.myproject.DBConnection.hybernate;

import org.hibernate.Session;

import com.zifo.myproject.DBConnection.pojo.EmpDetail;

public class EmpDetailDao {
	
	public void merge(EmpDetail entity, Session session) {
		session.merge(entity);
	}
	
	
	public void persist(EmpDetail entity, Session session) {
		session.persist(entity);
	}
	
	
	public void deleteByID(String id, Session session) {
		throw new UnsupportedOperationException(this.getClass().getSimpleName()+" "+"deleteByid(String if, Session session)");
	}

	
	public EmpDetail findById(String id, Session session) {
		EmpDetail empdDetail = session.find(EmpDetail.class, id);
		return empdDetail;
	}


	@SuppressWarnings("deprecation")
	public void update(EmpDetail entity, Session session) {
		session.update(entity);
		
	}
}
