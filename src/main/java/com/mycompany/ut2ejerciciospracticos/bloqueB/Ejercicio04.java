/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM2P
 */
public class Ejercicio04 {
    public static void main(String[] args) throws IOException {
       //Cogemos la imagen original
        FileInputStream imagenOriginal = new FileInputStream("logo.png");
        
        //Creamos un nuevo archivo que será la copia
        FileOutputStream copia = new FileOutputStream("copia_logo.png");
        
        //Creo una variable donde se irá guardando cada byte leído
        int dato;
        
        //Mediante un bucle while leemos byte a byte y 
        //cuando el método read() devuelva -1 será que ha llegado al final
        while ((dato = imagenOriginal.read()) != -1) {
            copia.write(dato);
        }
        
        imagenOriginal.close();
        copia.close();
    }
}
