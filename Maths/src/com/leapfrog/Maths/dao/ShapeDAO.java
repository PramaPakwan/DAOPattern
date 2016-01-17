/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Maths.dao;

import com.leapfrog.Maths.entity.Shape;

/**
 *
 * @author QWERTY
 */
public interface ShapeDAO {
    int area(Shape s);
    int perimeter(Shape s);
    
    
    
}
