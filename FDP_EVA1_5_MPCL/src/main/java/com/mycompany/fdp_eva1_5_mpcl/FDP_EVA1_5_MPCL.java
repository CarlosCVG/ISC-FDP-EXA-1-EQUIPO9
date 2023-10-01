/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fdp_eva1_5_mpcl;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class FDP_EVA1_5_MPCL {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double velocidad, altura, distancia;
        double GRAV = 9.81;
        double SIN45 = 0.7071;
        double COS45 = SIN45;

        System.out.println("Ingrese la velocidad inicial del disparo del cañon en m/s: ");
        velocidad = teclado.nextDouble();
        
        altura = ( (Math.pow(velocidad, 2) * (Math.pow(SIN45, 2)) ) / (2 * GRAV) );
        distancia = ( (Math.pow(velocidad, 2) * 2 * SIN45 * COS45) / GRAV );

        System.out.println("Altura máxima: " + altura + " m");
        
        System.out.println("Distancia horizontal: " + distancia + " m");
    }
}
