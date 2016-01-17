/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Maths.dao.impl;

import com.leapfrog.Maths.dao.ShapeDAO;
import com.leapfrog.Maths.entity.Shape;

/**
 *
 * @author QWERTY
 */
public class ShapeDAOImpl implements ShapeDAO {

   

    @Override
    public int area(Shape s) {
        
        return s.getBreath()* s.getLenght();
    }

    @Override
    public int perimeter(Shape s) {
        
        return s.getBreath()+s.getLenght();
    }

    
}
