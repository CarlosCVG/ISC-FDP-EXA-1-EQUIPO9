/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fdp_eva1_6_movimiento_angular;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class FDP_EVA1_6_MOVIMIENTO_ANGULAR {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double velAinicial;
        double velAfinal;
        double velMetros;
        double tiempoRota;
        double radio;
        double aceleracionA;
        double aceleracionM;
        double distAngular;
        double distMetros;
        double velApromedio;
        double frecHZ;
        double PI = 3.1416;
        System.out.println("Movimiento angular de una rueda");
        System.out.println("Introduce la velocidad inicial angular en radianes/segundo:");
        velAinicial = teclado.nextDouble();
        System.out.println("Introduce la velocidad final angular en radianes/segundo:");
        velAfinal = teclado.nextDouble();
        System.out.println("Introduce el tiempo de rotación de la rueda en segundos:");
        tiempoRota = teclado.nextDouble();
        System.out.println("Introduce el radio de la rueda en metros:");
        radio = teclado.nextDouble();
        
        aceleracionA = (velAfinal - velAinicial)/tiempoRota;
        distAngular = (velAinicial * tiempoRota) + (0.5 * aceleracionA * Math.pow(tiempoRota, 2));
        distMetros = distAngular * radio;
        velApromedio = (velAfinal + velAinicial)/2;
        velMetros = radio * velApromedio;
        aceleracionM = radio * aceleracionA; 
        frecHZ = velApromedio/(2 * PI);

        System.out.println("La distancia angular que recorre es: " + distAngular + " radianes");
        System.out.println("La distancia recorrida en metros es: " + distMetros + " metros");
        System.out.println("La velocidad angular promedio es: " + velApromedio + " radianes/segundo");
        System.out.println("La velocidad media es: " + velMetros + " metros/segundo");
        System.out.println("La aceleración angular es: " + aceleracionA + " radianes/s^2");
        System.out.println("La aceleración en metros/s^2 es: " + aceleracionM + " metros/s^2");
        System.out.println("La frecuencia de giro en Hertz es: " + frecHZ + " Hertz");
        
    }
}
