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
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);
        
        int cantElementos;
        
        //preguntamos por el tamaño del vector
        System.out.print("Ingresa el tamaño del vector: ");
        cantElementos = entradaT.nextInt();
        
        //declaramos el vector y su tamaño
        int numeros[] = new int[cantElementos];
        
        //numeros[0] = 1;
        
        //Llenar el vector con entradas de teclado
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingresa el elemento " + (i + 1) + ": ");
            numeros[i] = entradaT.nextInt();
        }
        
        System.out.println("\nLos elementos del vector son: ");
        // Mostrar los elementos del vector
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posición [" + i + "]: " + numeros[i]);
        }
    }
    
}
