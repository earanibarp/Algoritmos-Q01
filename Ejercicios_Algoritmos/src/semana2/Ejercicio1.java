/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2;

import java.util.Scanner;

/**
 *
 * @author earanibarp
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Obtener el �rea de un rect�ngulo.
        Scanner entradaT = new Scanner(System.in);
        
        //variables
        int lado1, lado2, area;
        
        //leer
        System.out.print("Ingresa el primer lado: ");
        lado1 = entradaT.nextInt();
        
        System.out.print("Ingresa el segundo lado: ");
        lado2 = entradaT.nextInt();
        
        //proceso
        area = lado1 * lado2;
        
        //escribir
        System.out.println("El �rea del rect�ngulo es: " + area);
    }
    
}
