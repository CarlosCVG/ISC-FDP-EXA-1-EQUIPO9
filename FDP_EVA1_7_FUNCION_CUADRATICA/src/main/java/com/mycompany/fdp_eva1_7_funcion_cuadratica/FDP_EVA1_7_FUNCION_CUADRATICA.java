/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fdp_eva1_7_funcion_cuadratica;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class FDP_EVA1_7_FUNCION_CUADRATICA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x;
        double b;
        double a;
        double pendiente;
        double area;
        
        System.out.println("Introduce la posición en X del cual quieras conocer su pendiente: ");
        x = teclado.nextDouble();
        System.out.println("Introduce el primer valor de X (b)(Calcular el área): ");
        a = teclado.nextDouble();
        System.out.println("Introduce el segundo valor de X (a)(Calcular el área): ");
        b = teclado.nextDouble();
        
        pendiente = (2 * x);
        area = (Math.pow(b, 3)/3) - (Math.pow(a, 3)/3);
        System.out.println("El valor de la pendiente del número introducido es: " + pendiente);
        System.out.println("El valor del área bajo los puntos seleccionados es: " + area);
    }
}
