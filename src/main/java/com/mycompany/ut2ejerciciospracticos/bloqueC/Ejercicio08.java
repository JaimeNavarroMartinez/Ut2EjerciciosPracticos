/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueC;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jaime Navarro
 */
public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario la ruta del archivo
        System.out.print("Introduce la ruta del archivo: ");
        String ruta = teclado.nextLine();
        
        //Implementamos un try-catch para la gestión de las excepciones
        //Intentamos abrir el archivo con FileReader
        try (FileReader lector = new FileReader(ruta)) {
            
            //Si lo encuentra y entra al archivo
            System.out.println("Archivo abierto correctamente");
            
            //Si el archivo no existe o la ruta está mal
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            
            //Aqui gestionamos cualquier otro error
            System.out.println("Ha ocurrido un error al abrir el archivo.");
        }

    }
}
