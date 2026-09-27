/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueB;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jaime Navarro
 */
public class Ejercicio06 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        //Usamos FileWriter para abrir el archivo o crearlo si no existe
        //El true sirve para que no borre los datos antiguos.
        FileWriter escribirDatos = new FileWriter("calificaciones.txt", true);

        //Le aniadimos BufferedWriter para escrbir de forma más cómoda
        BufferedWriter buffer = new BufferedWriter(escribirDatos);

        //Implementamos un bucle for para repetir el proceso tres veces
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el nombre del alumno: ");
            String nombre = teclado.nextLine();

            System.out.println("Introduce la nota: ");
            String nota = teclado.nextLine();

            //Escribimos los datos en el archivo y hacemos un salto de línea
            buffer.write(nombre + " - " + nota);
            buffer.newLine();

        }
        buffer.close();
    }
}
