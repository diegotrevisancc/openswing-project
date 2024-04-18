/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.curso.open.swing.util;

/**
 *
 * @author diego
 */
public abstract class Util {
    private static Alerta objAlerta;
    
    public static Alerta getAlerta() {
        if (objAlerta == null) {
            objAlerta = new Alerta();
        }
        return objAlerta;
    }
    
}
