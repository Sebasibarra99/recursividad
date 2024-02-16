/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursividad;

/**
 *
 * @author salas
 */


import java.util.Scanner;


public class Recursividad {

    

    public static int potencia(int base, int exponente) {

        // Caso base: si el exponente es 0, el resultado es 1

        if (exponente == 0) {

            return 1;

        }

        // Caso recursivo: multiplicamos la base por la potencia(base, exponente - 1)

      return suma(base, potencia(base, exponente - 1), 0);

    }

    

    public static int suma(int a, int b, int sum) {

        // Si b es 0, hemos sumado todo, así que retornamos el resultado actual

        if (b == 0) {

            return sum;

        }

        // Sumamos 'a' a 'sum' y decrementamos 'b' en 1

        return suma(a, b - 1, sum + a);

    }

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

       System.out.print("Ingrese un número base: ");

        int base = scanner.nextInt();

         System.out.print("Ingrese un número exponente: ");

        int exponente = scanner.nextInt();

        int resultado = potencia(base, exponente);

        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);

    }

}