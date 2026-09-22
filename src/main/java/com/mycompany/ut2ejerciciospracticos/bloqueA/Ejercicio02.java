/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueA;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DAM2P
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una ruta: ");
        String ruta = teclado.nextLine();

        File archivo = new File(ruta, "temp.bak");

        if (archivo.exists()) {
            System.out.println("El archivo existe.");

            archivo.delete();

            System.out.println("Archivo borrado correctamente.");

        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
