package com.zifo.myproject.DBConnection.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="EMPDETAIL")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class EmpDetail {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "age")
	private int age;

}
