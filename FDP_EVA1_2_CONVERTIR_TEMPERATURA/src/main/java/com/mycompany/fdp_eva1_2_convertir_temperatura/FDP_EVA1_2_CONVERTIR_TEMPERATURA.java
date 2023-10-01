/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fdp_eva1_2_convertir_temperatura;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class FDP_EVA1_2_CONVERTIR_TEMPERATURA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gradosFah;
        double gradosCen;
        double gradosKel;
        System.out.println("Convertidor de temperatura");
        System.out.println("Introduce la temperatura en grados Fahrenheit:");
        gradosFah = teclado.nextDouble();
        gradosCen = (((gradosFah - 32) * 5)/9);
        gradosKel = (((gradosFah - 32) * 5)/9) + 273.15;
        System.out.println("La temperatura introducida es equivalente a " + gradosCen + " grados centígrados");
        System.out.println("La temperatura introducida es equivalente a " + gradosKel + " grados kelvin");
    }
}
