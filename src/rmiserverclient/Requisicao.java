/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmiserverclient;

import java.io.Serializable;
/**
 *
 * @author luana.teixeira
 */
public class Requisicao implements Serializable {
    String msg;
    Requisicao (String msg){
        this.msg = msg;
    }
    public Resultado executa(){
        System.out.println(msg);
        String username = msg.split(":")[0];
        String resultMessage = "Server: Ola, " + username + "! Mensagem Recebida!";
        Resultado result = new Resultado(resultMessage);
        System.out.println(result.msg);
        return result;
    }
}