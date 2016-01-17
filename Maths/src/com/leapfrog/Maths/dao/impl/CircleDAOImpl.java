/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Maths.dao.impl;

import com.leapfrog.Maths.dao.CircleDAO;
import com.leapfrog.Maths.entity.Circle;

/**
 *
 * @author QWERTY
 */
public class CircleDAOImpl implements CircleDAO {
     
    @Override
    public float areaCircle(Circle c) {
        return  (float) (c.getRadius()*c.getRadius()*3.14);
    }

    @Override
    public float perimeterCircle(Circle c) {
    return (float) (2*3.14*c.getRadius());
        
    }
    
    
}
