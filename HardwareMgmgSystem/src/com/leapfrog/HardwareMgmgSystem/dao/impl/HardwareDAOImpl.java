/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.HardwareMgmgSystem.dao.impl;

import com.leapfrog.HardwareMgmgSystem.dao.HardwareDAO;
import com.leapfrog.HardwareMgmgSystem.entity.Hardware;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QWERTY
 */
public class HardwareDAOImpl implements HardwareDAO {
    private List<Hardware> hardwareList;

    public HardwareDAOImpl() {
        hardwareList=new ArrayList<>();
    }
    

    @Override
    public void insert(Hardware h) {
        hardwareList.add(h);
    }

    @Override
    public boolean delete(int id) {
        for(Hardware h:hardwareList){
            if(h.getId()==id){
                hardwareList.remove(h);
                return true;
            }
        }
       return false; 
    }

    @Override
    public void update(Hardware h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hardware getById(int id) {
        for(Hardware h:hardwareList){
            if(h.getId()==id){
                return h;
            }
        }
        return null;
    }

    @Override
    public List<Hardware> getAll() {
        
        return hardwareList;
    }
    
}
