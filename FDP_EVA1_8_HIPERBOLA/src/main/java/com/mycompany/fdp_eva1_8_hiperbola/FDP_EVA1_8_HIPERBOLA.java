/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fdp_eva1_8_hiperbola;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class FDP_EVA1_8_HIPERBOLA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //variables
        double coordenada_x;
        double coordenada_y;
        double vertice_a;
        double vertice_b;
        double resultado;
        double resultado_raiz;
        double verticeDist;

        System.out.println("Captura coordenada_x");
        coordenada_x = teclado.nextDouble();
        System.out.println("Captura coordenda_y");
        coordenada_y = teclado.nextDouble();
        System.out.println("Captura el divisor en X");
        vertice_a = teclado.nextDouble();
        System.out.println("Captura el divisor en Y");
        vertice_b = teclado.nextDouble();

        verticeDist = Math.sqrt(vertice_a);
        resultado = vertice_a+vertice_b;
        resultado_raiz = Math.sqrt(resultado);
        //c = Math.sqrt(Math.pow(vertice_a, 2) + Math.pow(vertice_b, 2));
        System.out.println("Distancia del centro hacia el foco " + resultado_raiz);
        System.out.println("Coordenadas del vértice derecho (" + (coordenada_x + verticeDist) + "," + coordenada_y + ")");
        System.out.println("Coordenadas del vértice izquierdo (" + (coordenada_x - verticeDist) + "," + coordenada_y + ")");
        System.out.println("Coordenadas del foco derecho (" + (coordenada_x + resultado_raiz) + "," + coordenada_y + ")");
        System.out.println("Coordenadas del foco izquierdo (" + (coordenada_x - resultado_raiz) + "," + coordenada_y + ")");
    }

}
