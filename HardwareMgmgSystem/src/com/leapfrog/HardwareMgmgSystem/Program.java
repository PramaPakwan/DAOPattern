/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.HardwareMgmgSystem;

import com.leapfrog.HardwareMgmgSystem.dao.HardwareDAO;
import com.leapfrog.HardwareMgmgSystem.dao.impl.HardwareDAOImpl;
import com.leapfrog.HardwareMgmgSystem.entity.Hardware;
import java.util.Scanner;

/**
 *
 * @author QWERTY
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HardwareDAO hardwareDAO=new HardwareDAOImpl();
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("******************************");
            System.out.println("Hardware management System");
            System.out.println("1. To add new hardware");
            System.out.println("2. To view all hardware");
            System.out.println("3. To delete hardware");
            System.out.println("4 . To exit");
            System.out.println("Enter value from [1-4]");

            switch(input.nextInt()){
                case 1:
                    while(true){
                        Hardware h=new Hardware();
                        System.out.println("Enter hardware id");
                        h.setId(input.nextInt());

                        System.out.println("Enter Hardware name");
                        h.setHardwareName(input.next());

                        System.out.println("Enter Hardware code");
                        h.setHardwareCode(input.next());

                        System.out.println("Enter Hardware Model");
                        h.setHardwareModel(input.next());

                        System.out.println("Enter status");
                        h.setStatus(input.nextBoolean());

                        hardwareDAO.insert(h);
                        System.out.println("Do you want to add more [Y/N]?");
                        if(input.next().equalsIgnoreCase("n")){
                            break;
                        }
                    }
                case 2:
                    hardwareDAO.getAll().forEach(h->{
                    System.out.println(h);
                });
                    break;
                case 3:
                    System.out.println("Enter id to delete");
                    hardwareDAO.delete(input.nextInt());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter number between 1 to 4 only");
                    break;
            }

        }
    }
    
}
