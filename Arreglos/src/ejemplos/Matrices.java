/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author earanibarp
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entradaT = new Scanner(System.in);
        
        int nFilas, nColumnas;
        
        //preguntamos por el tamaño de la matriz
        System.out.print("Ingresa la cantidad de filas: ");
        nFilas = entradaT.nextInt();
        
         System.out.print("Ingresa la cantidad de columnas: ");
        nColumnas = entradaT.nextInt();

        int matriz[][] = new int[nFilas][nColumnas];

        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columna
                System.out.print("Ingresa el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entradaT.nextInt();
            }
        }

        System.out.println("\nLos elementos de la matriz son: ");

        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Filas:" + matriz.length); //cantidad de filas
        System.out.println("Columnas:" + matriz[0].length); // cantidad de columnas
    }

}
