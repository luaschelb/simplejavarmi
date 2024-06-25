package rmiserverclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        String nome = "rmi://localhost:1101/chat_remoto";
        IMessage objR; // referência remota

        try {
            objR = (IMessage) Naming.lookup(nome);
            Scanner scanner = new Scanner(System.in);
            String mensagem;
            String username;
            System.out.print("Digite seu nome de usuario:");
            username = scanner.nextLine();

            while (true) {
                System.out.print(username + ": ");
                mensagem = scanner.nextLine();

                if (mensagem.equalsIgnoreCase("quit")) {
                    System.out.println("Encerrando o programa...");
                    break;
                }

                Requisicao req = new Requisicao(username + ": " + mensagem);
                Resultado resultado = objR.requisita(req);
                System.out.println(resultado.msg);
            }

            scanner.close();
        } catch (NotBoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}