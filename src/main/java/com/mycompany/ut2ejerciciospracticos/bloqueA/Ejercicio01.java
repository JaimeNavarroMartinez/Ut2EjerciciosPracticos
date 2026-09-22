/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueA;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author DAM2P
 */
public class Ejercicio01 {

    public static void main(String[] args) throws IOException {

        File carpeta = new File("C:/ficheros_dam");

        if (carpeta.exists()) {
            System.out.println("El directorio existe.");
            System.out.println("Contiene: " + carpeta.listFiles().length + " archivos.");
        } else {
            carpeta.mkdir();

            File fichero = new File(carpeta, "setup.log");
            fichero.createNewFile();
        }
    }
}
