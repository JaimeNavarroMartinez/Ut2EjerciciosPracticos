/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueB;

import java.io.RandomAccessFile;

/**
 *
 * @author Jaime Navarro
 */
public class Ejercicio07 {
    public static void main(String[] args) throws IOException {

        // Abrimos el archivo en modo lectura y escritura
        RandomAccessFile archivo = new RandomAccessFile("datos.dat", "rw");
        
        // Escribimos tres números enteros seguidos
        archivo.writeInt(10);
        archivo.writeInt(20);
        archivo.writeInt(30);
    }
}
