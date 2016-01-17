/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lepafrog.TeacherMgmtSystem.dao.impl;

import com.lepafrog.TeacherMgmtSystem.dao.TeacherDAO;
import com.lepafrog.TeacherMgmtSystem.util.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QWERTY
 */
public class TeacherDAOImpl implements TeacherDAO{
    private List<Teacher> teacherList;

    public TeacherDAOImpl() {
        teacherList = new ArrayList<>();
    }
    
    @Override
    public void insert(Teacher t) {
        teacherList.add(t);
        
    }

    @Override
    public boolean delete(int id) {
          for(Teacher t:teacherList){
              if(t.getId()==id){
                  teacherList.remove(t);
                  return true;
              }
          }
          return false;
    }

    @Override
    public void update(Teacher t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Teacher getById(int id) {
        for(Teacher t:teacherList){
            if(t.getId()==id){
                return t;
            }
        }
        return null;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
    
    
}
