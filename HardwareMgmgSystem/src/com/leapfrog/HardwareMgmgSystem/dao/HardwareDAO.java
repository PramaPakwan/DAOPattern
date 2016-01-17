/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.HardwareMgmgSystem.dao;

import com.leapfrog.HardwareMgmgSystem.entity.Hardware;
import java.util.List;

/**
 *
 * @author QWERTY
 */
public interface HardwareDAO {
    void insert(Hardware h);
    boolean delete(int id);
    void update(Hardware h);
    Hardware getById(int id);
    List<Hardware> getAll();
    
    
    
}
