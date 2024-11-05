package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  
@Table(name = "student_demo") 
public class Student {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name = "stud_id")  
    private int studId;

    @Column(name = "first_name")
    private String f_name;

    @Column(name = "last_name")
    private String l_name;

    @Column(name = "student_gender")
    private String gender;

    @Column(name = "student_address")
    private String address;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", f_name=" + f_name + ", l_name=" + l_name + ", gender=" + gender
				+ ", address=" + address + "]";
	}

}
    
    	