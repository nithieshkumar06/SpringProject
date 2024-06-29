package com.zifo.myproject.DBConnection.hybernate;

import com.zifo.myproject.DBConnection.pojo.EmpDetail;

public class HybernateMappingUtil {
	
	public EmpDetail getEmpDetail( ) {
		

		EmpDetail employe = 
				EmpDetail
			.builder()
			.id(901)
			.name("Ravi")
			.email("Ravi@gmail.com")
			.location("Zillion")
			.age(21)
			.build();
		
		return employe;
	}
}
