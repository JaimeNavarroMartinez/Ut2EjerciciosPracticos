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

        //Creamos una variable para contabilizar cada línea, un contador para saber cuantas líneas tiene el archivo
        //y otro contador para saber cuantas veces encontramos "Quijote"
        String linea;
        int contadorLineas = 0;
        int contadorQuijote = 0;

        //Empleamos un bucle While para leer las lineas del archivo
        while ((linea = buffer.readLine()) != null) {
            contadorLineas++;

            //Dentro del while empleamos un if para comprobar si la linea tiene la palabra Quijote
            if (linea.contains("Quijote")) {
                contadorQuijote++;
            }
        }

        buffer.close();
        lector.close();

        //Muestro los resultados
        System.out.println("Número de líneas: " + contadorLineas);
        System.out.println("Número de veces que aparece la palabra 'Quijote': " + contadorQuijote);
    }
}
