package com.dao;

import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Student_dao_operation {
	 public void insert_Data(Student student) 
	    {
    
    
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
    	
        

//	     ss.persist(ss);
	     System.out.println("Data Inserted");
	        
	       
			t.commit();
	        ss.close();
	     
    }

    public void update_Data(Student s) 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
		
        String hqlQuery = "update Student set f_name = :firstname, l_name = :lastname, gender = :stud_gender , address = :stud_address where studId = :studid";
        
        Query query = ss.createQuery(hqlQuery);
        
        query.setParameter("firstname", s.getF_name());
        query.setParameter("lastname", s.getL_name());
        query.setParameter("stud_gender", s.getGender());
        query.setParameter("stud_address", s.getAddress());
        query.setParameter("studid", s.getStudId());
        
        
        query.executeUpdate();
        
        System.out.println("Data Updated");
        
        t.commit();
        ss.close();
    }

    public void delete_Data(int studId) 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
    	
//        String hqlQuery = "delete from Student where studId; = :studid";
        String hqlQuery = "delete from Student where studId = :studid";

        
        Query query = ss.createQuery(hqlQuery);
        query.setParameter("studid", studId);
        
        query.executeUpdate();
        
        System.out.println("Record Deleted");
       
        t.commit();
        ss.close();
    }

    public void displayAll_Data() 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
       
        String hqlQuery = "from Student";
        Query query = ss.createQuery(hqlQuery, Student.class);
        List<Student> list = query.getResultList();
      
        System.out.println("Student Details:");
        
        for (Student student : list) 
        {
            System.out.println(student);
        }
        t.commit();
        ss.close();
    }

    public Student displaySingle_Data(int myid) 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
        
        String hqlQuery = "from Student where studId; = :studid";
        Query query = ss.createQuery(hqlQuery, Student.class);
        Object studid = null;
		query.setParameter("studid", studid);
        
        Student student = (Student) query.getSingleResult();
        t.commit();
        ss.close();
        return student;
    }

	
	
}

