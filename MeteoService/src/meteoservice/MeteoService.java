/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteoservice;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author DL9
 */

public class MeteoService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        try {      
            Registry registry = LocateRegistry.createRegistry(4499);
            registry.rebind("MServer", new MServer());
            
            System.out.println("Server running :)");
            
        }
        catch(Exception e)
        {
            System.err.println("MSERVER exception:");
            e.printStackTrace();
        }
        
        
    }
    
}
