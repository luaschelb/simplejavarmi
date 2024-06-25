package rmiserverclient;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Message extends UnicastRemoteObject implements IMessage{
   Message()throws RemoteException{
   }
    @Override
    public Resultado requisita(Requisicao r) throws RemoteException {
        Resultado resultado = r.executa();
        return resultado;
    }
}
