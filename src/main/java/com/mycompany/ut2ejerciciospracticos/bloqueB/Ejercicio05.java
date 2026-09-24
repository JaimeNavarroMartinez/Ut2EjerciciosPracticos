/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DAM2P
 */
public class Ejercicio05 {
    public static void main(String[] args) throws IOException {
       //Abrimos el archivo para leerlo.
       FileReader lector = new FileReader("quijote.txt");
       
       //Añadimos un BufferedReader para leer el archivo 
       //línea a línea
       BufferedReader buffer = new BufferedReader(lector);
       
       //Creamos una variable para contabilizar cada línea.
       String linea;
    }
}
