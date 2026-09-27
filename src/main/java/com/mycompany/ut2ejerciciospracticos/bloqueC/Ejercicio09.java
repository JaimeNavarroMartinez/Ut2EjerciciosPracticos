/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueC;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jaime Navarro
 */
public class Ejercicio09 {

    public static void main(String[] args) throws IOException {
        //Abrimos el archivo para leerlo con FileReader y BufferedReader para leer línea a línea
        FileReader lector = new FileReader("datos_notas.txt");
        BufferedReader buffer = new BufferedReader(lector);

        //Variable donde leeremos línea a línea
        String linea;

        //Leemos  todas la líneas del archivo mediante un bucle while
        while ((linea = buffer.readLine()) != null) {
            try {
                //Intentamos convertir la línea a número decimal
                double nota = Double.parseDouble(linea);

                //si funciona mostramos la nota
                System.out.println("Nota valida: " + nota);

            } catch (NumberFormatException e) {
                //Si la linea no se puede convertir a numero se muestra un aviso
                System.out.println("Dato no valido: " + linea);
            }
        }
        buffer.close();
    }
}
