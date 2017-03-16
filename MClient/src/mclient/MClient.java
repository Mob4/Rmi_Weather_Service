/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicArrowButton;
import meteoservice.IMServer;
import meteoservice.MeteoService;

/**
 *
 * @author DL9
 */
public class MClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            // ce code a etait re-integré dans jButton1ActionPerformed de Myjframe
        /*try {
            Registry reg=LocateRegistry.getRegistry("localhost",4499);
            IMServer rmi=(IMServer)reg.lookup("MServer");
            
            System.out.println(rmi.getMeteo("Casablanca"));
            
            
        } catch (Exception e) {
        }*/
    }
    
}
