/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteoservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author DL9
 */
public interface IMServer extends Remote{
    public String getMeteo(String cityName) throws RemoteException;
}
