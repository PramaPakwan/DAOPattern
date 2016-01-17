/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.HardwareMgmgSystem.entity;

/**
 *
 * @author QWERTY
 */
public class Hardware {
    private int id;
    private String hardwareName,hardwareCode,hardwareModel;
    private boolean status;

    public Hardware() {
    }
    
    // Overloaded Constructor

    public Hardware(int id, String hardwareName, String hardwareCode, String hardwareModel, boolean status) {
        this.id = id;
        this.hardwareName = hardwareName;
        this.hardwareCode = hardwareCode;
        this.hardwareModel = hardwareModel;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getHardwareCode() {
        return hardwareCode;
    }

    public void setHardwareCode(String hardwareCode) {
        this.hardwareCode = hardwareCode;
    }

    public String getHardwareModel() {
        return hardwareModel;
    }

    public void setHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // Overloaded function 

    @Override
    public String toString() {
        return "Hardware{" + "id=" + id + ", hardwareName=" + hardwareName + ", hardwareCode=" + hardwareCode + ", hardwareModel=" + hardwareModel + ", status=" + status + '}';
    }
    
    
}
