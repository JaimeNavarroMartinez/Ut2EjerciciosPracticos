/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut2ejerciciospracticos.bloqueA;

import java.io.File;

/**
 *
 * @author DAM2P
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        File carpeta = new File("MurciaFP/2026/AccesoDatos");
        
        carpeta.mkdirs();
        
        File nuevaCarpeta = new File("MurciaFP/2026/AD_Backup");
        
        carpeta.renameTo(nuevaCarpeta);
        
    }
}
