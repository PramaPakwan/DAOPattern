/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lepafrog.TeacherMgmtSystem;

import com.lepafrog.TeacherMgmtSystem.dao.TeacherDAO;
import com.lepafrog.TeacherMgmtSystem.dao.impl.TeacherDAOImpl;
import com.lepafrog.TeacherMgmtSystem.util.Teacher;
import java.util.Scanner;

/**
 *
 * @author QWERTY
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TeacherDAO teacherDAO=new TeacherDAOImpl();
        Scanner input=new Scanner(System.in);
       
        System.out.println("******************************");
        System.out.println("**Teacher Management System**");
        while(true){
        System.out.println("1. To add New teacher");
        System.out.println("2. To view all Teacher");
        System.out.println("3. To delete a teacher");
        System.out.println("4. To exit from system");
        System.out.println("Enter from 1 to 4");
        switch(input.nextInt()){
            case 1:
                while(true){
                    Teacher t=new Teacher();
                    System.out.println("Enter Id");
                    t.setId(input.nextInt());
                    
                    System.out.println("Enter Firstname");
                    t.setFirstName(input.next());
                    
                    System.out.println("Enter Last Name");
                    t.setLastName(input.next());
                    
                    System.out.println("Enter Address");
                    t.setAddress(input.next());
                    
                    System.out.println("Enter status");
                    t.setStatus(input.nextBoolean());
                    
                    teacherDAO.insert(t);
                    System.out.println("Do you want to add more Teacher [Y/N] ?");
                    if(input.next().equalsIgnoreCase("n")){
                        break;
                    }
                }
            case 2:
                teacherDAO.getAll().forEach(t->{
                    System.out.println(t);
                    
                });
               
                break;
            case 3:
                System.out.println("Enter id to delete");
                int teacherID=input.nextInt();
                if(teacherDAO.delete(teacherID)==true){
                    System.out.println("Teacher Id:: " + teacherID + "has been deleted");
                    System.out.println("");
                }
                else{
                    System.out.println("Teacher Id:: " + teacherID + " is not present");
                    System.out.println("");
                }
                break;
            case 4:
                System.exit(0);
            break;     
                    
        }
    }
    }   
}
