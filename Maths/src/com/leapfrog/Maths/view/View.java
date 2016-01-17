/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Maths.view;

import com.leapfrog.Maths.dao.CircleDAO;
import com.leapfrog.Maths.dao.ShapeDAO;
import com.leapfrog.Maths.dao.impl.CircleDAOImpl;
import com.leapfrog.Maths.dao.impl.ShapeDAOImpl;
import com.leapfrog.Maths.entity.Circle;
import com.leapfrog.Maths.entity.Shape;
import java.util.Scanner;

/**
 *
 * @author QWERTY
 */
public class View {

    
    

    public void ViewAll() {
        ShapeDAO shapeDAO=new ShapeDAOImpl();
        CircleDAO circleDAO=new CircleDAOImpl();
    
        Scanner input=new Scanner(System.in);
        System.out.println("MAths in Shape");
        System.out.println("1. To find area");
        System.out.println("2. To find perimeter");
        System.out.println("3 to exit");
        
        switch(input.nextInt()){
            case 1:
                 while(true){
                    System.out.println("Enter name of shape  to find Area");
                    String sh=input.next();
                    
                    if(sh.equalsIgnoreCase("square")){
                        Shape s=new Shape();
                        System.out.println("Enter lenght of sqaure::");
                        s.setLenght(input.nextInt());
                        System.out.println("Enter breath of Square::");
                        s.setBreath(input.nextInt());
                        System.out.println("Area of Square = " + shapeDAO.area(s));
                    }
                    else if(sh.equalsIgnoreCase("circle")){
                        Circle c=new Circle();
                        System.out.println("Enter radius of circle::");
                        c.setRadius(input.nextFloat());
                        System.out.println("Area of Circle = " + circleDAO.areaCircle(c));
                    }
                    else{
                        System.out.println("No shape available");
                    }
                    System.out.println("Do you want to find more");
                    if(input.next().equalsIgnoreCase("n")){
                         break;
                     }
                }
                break;
            case 2:
                while(true){
                    System.out.println("Enter name of shape  to find Perimeter");
                    String peri=input.next();
                    if(peri.equalsIgnoreCase("square")){
                        Shape s=new Shape();
                        System.out.println("Enter breath");
                        s.setBreath(input.nextInt());
                        System.out.println("Enter length");
                        s.setLenght(input.nextInt());
                        System.out.println("Perimeter of Square =" + shapeDAO.perimeter(s));
                    }
                    else if(peri.equalsIgnoreCase("circle")){
                        Circle c=new Circle();
                        System.out.println("Enter radius of circle::");
                        c.setRadius(input.nextFloat());
                        System.out.println("Perimeter of Circle = " + circleDAO.perimeterCircle(c));
                    }
                    else{
                        System.out.println("Shape mismatch");
                    }
                    System.out.println("Do you want to continue [Y/N]??");
                    if(input.next().equalsIgnoreCase("n")){
                         break;
                    }
                }
                break;
            case 3:
                System.exit(0);
                break;
        }
    
    }
}
