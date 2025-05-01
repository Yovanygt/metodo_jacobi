/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodojacobi;

import java.util.Scanner;

public class MetodoJacobi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de ecuaciones: ");
        int n = scanner.nextInt();

        double[][] A = new double[n][n]; // Matriz de coeficientes
        double[] b = new double[n];      // Términos independientes
        double[] x = new double[n];      // Valores actuales
        double[] xNuevo = new double[n]; // Nuevos valores
        double tolerancia;

        // Ingreso de la matriz A
        System.out.println("Ingrese los coeficientes del sistema:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextDouble();
            }
        }

        // Ingreso del vector b
        System.out.println("Ingrese los términos independientes:");
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextDouble();
        }

        // Ingreso de valores iniciales
        System.out.println("Ingrese los valores iniciales:");
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextDouble();
        }

        // Ingreso de la tolerancia
        System.out.print("Ingrese la tolerancia de error: ");
        tolerancia = scanner.nextDouble();

        // Iteración del método
        int iteracion = 0;
        boolean continuar;

        System.out.println("\nIteraciones del Método de Jacobi:");
        do {
            continuar = false;
            iteracion++;
            System.out.println("Iteración " + iteracion);

            for (int i = 0; i < n; i++) {
                double suma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * x[j];
                    }
                }

                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            // Mostrar resultados y calcular errores
            for (int i = 0; i < n; i++) {
                double error = Math.abs(xNuevo[i] - x[i]);
                System.out.printf("x[%d] = %.6f\t Error = %.6f\n", i, xNuevo[i], error);
                if (error > tolerancia) {
                    continuar = true;
                }
                x[i] = xNuevo[i]; // actualizar para la siguiente iteración
            }

            System.out.println();

        } while (continuar);

        System.out.println("Solución final:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = %.6f\n", i, x[i]);
        }
    }
}
