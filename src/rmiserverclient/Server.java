/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rmiserverclient;

import java.rmi.registry.Registry;
/**
 *
 * @author luana.teixeira
 */
public class Server {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        String nome = "chat_remoto";
        try {
            IMessage obj_rem = new Message();
            Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1101);
            registry.bind(nome, obj_rem);
            System.out.println("Servidor esta sendo executado na porta 1101.");
        } catch (Exception e) {
            System.out.println("Excecao do objeto remoto "
                    + e.getMessage());
            e.printStackTrace();
        }
    }
}
