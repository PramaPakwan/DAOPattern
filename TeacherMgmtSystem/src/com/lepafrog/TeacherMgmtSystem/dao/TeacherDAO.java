/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lepafrog.TeacherMgmtSystem.dao;

import com.lepafrog.TeacherMgmtSystem.util.Teacher;
import java.util.List;

/**
 *
 * @author QWERTY
 */
public interface TeacherDAO {
    void insert(Teacher t);
    boolean delete(int id);
    void update(Teacher t);
    Teacher getById(int id);
    List<Teacher> getAll();
    
    
}
