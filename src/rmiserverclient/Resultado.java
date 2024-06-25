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
public class Resultado implements Serializable {
    String msg;
    Resultado (String msg){
        this.msg = msg;
    }
}