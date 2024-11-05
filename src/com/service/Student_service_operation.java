package com.service;

import java.util.Scanner;

import com.dao.Student_dao_operation;
import com.entity.Student;

    public class Student_service_operation {

        Student_dao_operation sd = new Student_dao_operation();
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        
        public void insert_Data() 
        {
            System.out.print("Enter Student First Name: ");
            s.setF_name(sc.nextLine());
            
            System.out.print("Enter Student Last Name: ");
            s.setL_name(sc.nextLine());
            
           
            System.out.print("Enter gender: ");
            s.setGender(sc.nextLine());
            
            System.out.print("Enter address: ");
            s.setAddress(sc.nextLine());
            
            
            sd.insert_Data(s);  
        }

    public void update_Data() 
    {
        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();
        s.setStudId(id);
        
        System.out.print("Enter New first Name: ");
        s.setF_name(sc.nextLine());
        
        System.out.print("Enter New last Name: ");
        s.setL_name(sc.nextLine());
        
        System.out.print("Enter gender : ");
        s.setGender(sc.nextLine());
        
        System.out.print("Enter New Address : ");
        s.setAddress(sc.nextLine());
        
        

        sd.update_Data(s);
    }

    public void delete_Data() 
    {
        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();
        sd.delete_Data(id);
    }

    public void displayAll_Data() 
    {
        sd.displayAll_Data();
    }

    public void displaySingle_Data() 
    {
        System.out.print("Enter Student ID to Display: ");
        int id = sc.nextInt();
        Student student = sd.displaySingle_Data(id);
        System.out.println(student);
    }
}

