/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lepafrog.TeacherMgmtSystem.util;

/**
 *
 * @author QWERTY
 */
public class Teacher {
    private int id;
    private String firstName,lastName,address,subject;
    private boolean status;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, String address, String subject, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.subject = subject;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", subject=" + subject + ", status=" + status + '}';
    }
    
    
    
}
