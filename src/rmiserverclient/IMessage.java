package rmiserverclient;

import java.rmi.Remote;
import java.rmi.RemoteException;
        
public interface IMessage extends Remote{
    Resultado requisita(Requisicao r) throws RemoteException;
}
