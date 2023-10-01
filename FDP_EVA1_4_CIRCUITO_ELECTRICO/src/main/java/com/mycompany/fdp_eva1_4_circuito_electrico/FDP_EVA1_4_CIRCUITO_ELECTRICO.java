/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fdp_eva1_4_circuito_electrico;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class FDP_EVA1_4_CIRCUITO_ELECTRICO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double r1, r2, r3, r4, r5;
        double rEquivalente, intensidad, VOLT; 
        
        System.out.println("Ingresa el voltaje del circuito");
        VOLT = teclado.nextInt();

        System.out.println("Ingrese el valor de la resistencia numero 1");
            r1 = teclado.nextDouble();
        System.out.println("Ingrese el valor de la resistencia numero 2");    
            r2 = teclado.nextDouble();
        System.out.println("Ingrese el valor de la resistencia numero 3");    
            r3 = teclado.nextDouble();
        System.out.println("Ingrese el valor de la resistencia numero 4");    
            r4 = teclado.nextDouble();
        System.out.println("Ingrese el valor de la resistencia numero 5");    
            r5 = teclado.nextDouble();
                    
        rEquivalente = 1 / ((1/r1) + (1/r2) + (1/r3) + (1/r4) + (1/r5));
        intensidad = (VOLT / rEquivalente);

        System.out.println("Resistencia equivalente: " + rEquivalente + " omns");
        
        System.out.println("Intensidad de la corriente: " + intensidad + " volts");

        System.out.println("Intensidad en la resistencia 1: " + (VOLT / r1));
        System.out.println("Intensidad en la resistencia 2: " + (VOLT / r2));
        System.out.println("Intensidad en la resistencia 3: " + (VOLT / r3));
        System.out.println("Intensidad en la resistencia 4: " + (VOLT / r4));
        System.out.println("Intensidad en la resistencia 5: " + (VOLT / r5));

    }
}
