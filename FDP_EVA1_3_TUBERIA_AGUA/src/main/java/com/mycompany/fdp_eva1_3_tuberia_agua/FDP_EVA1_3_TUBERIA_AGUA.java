/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fdp_eva1_3_tuberia_agua;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class FDP_EVA1_3_TUBERIA_AGUA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double radio;
        double velocidad;
        double area;
        double volumen;
        double PI = 3.1416;

        System.out.println("Ingresa el radio de la tubería (en metros): ");
        radio = teclado.nextInt();
        
        System.out.println("Ingresa la velocidad del flujo de agua (en m/s): ");
        velocidad = teclado.nextInt();

        area = (PI * Math.pow(radio, 2));
        volumen = area * velocidad;

        System.out.println("La cantidad de metros cúbicos que fluyen por la tubería es: " + volumen + " m^3/s");
    }
}
