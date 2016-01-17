/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Maths;

import com.leapfrog.Maths.dao.CircleDAO;
import com.leapfrog.Maths.dao.ShapeDAO;
import com.leapfrog.Maths.dao.impl.CircleDAOImpl;
import com.leapfrog.Maths.dao.impl.ShapeDAOImpl;
import com.leapfrog.Maths.entity.Circle;
import com.leapfrog.Maths.entity.Shape;
import com.leapfrog.Maths.view.View;
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
        
        while(true){
         View view=new View();
         view.ViewAll();
        }   
    }
    
}
