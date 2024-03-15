package com.management.demo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="emp_data")
public class EmployeeModel implements Serializable{
	public static final long serialVersionUID=1l;
	@Id
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private int age;
	@Column(nullable = false)
	private String gender;

	@Override
	public String toString() {
		return "id=" + id 
				+ ", name=" + name
				+ ", age=" + age 
				+ ", gender="+ gender ;
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name) {
		this.name =name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public EmployeeModel() {

	}

}
