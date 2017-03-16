/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteoservice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DL9
 */
public class MServer  extends UnicastRemoteObject implements IMServer{
    private List<Villes> listV;
    public MServer()  throws RemoteException
    {
        listV=new ArrayList<>() ; 
        listV.add(new Villes("Casablanca",14,19));// adding cities
        listV.add(new Villes("Mulhouse",10,-5));
        listV.add(new Villes("Strasbourg",5,-4));
        listV.add(new Villes("Paris",10,0));
        
    }
    public Villes findV(String name)
    {
        for(int i=0;i<listV.size();i++)
        {
            System.out.println(listV.get(i).getName());
            if(listV.get(i).getName().equals(name)) // extracting the object by comparing the names
            {
                return listV.get(i);
            }
        }
        
        return null;
    }
    @Override
    public String getMeteo(String cityName) throws RemoteException {
        return findV(cityName).getMeteo(); //Finds the city and give back the weather informations
       
    }
}