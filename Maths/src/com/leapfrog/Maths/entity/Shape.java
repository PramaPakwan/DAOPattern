/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Maths.entity;

/**
 *
 * @author QWERTY
 */
public class Shape {
    private int lenght,breath;

    public Shape() {
    }

    public Shape(int lenght, int breath) {
        this.lenght = lenght;
        this.breath = breath;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    @Override
    public String toString() {
        return "Shape{" + "lenght=" + lenght + ", breath=" + breath + '}';
    }
    
    
    
}
