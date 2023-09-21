/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;

import java.util.Scanner;

/**
 *
 * @author earanibarp
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);
        
        float c, f, k;
        int opc;
        
        System.out.print("Ingresa la temperatura en °C: ");
        c = entradaT.nextFloat();
        
        System.out.println("""
                           Ingresa el n\u00famero del tipo de conversi\u00f3n deseada: 
                           1.- Kelvin
                           2.- Fahrenheit""");
        opc = entradaT.nextInt();
        
        if (opc == 1) {
            k = c + 273.15f;
            System.out.println("La temperatura en °K es: " + k);
        }else{
            if(opc == 2){
                f = (9 * c) / 5 + 32;
                System.out.println("La temperatura en °F es: " + f);
                
            }else{
                System.out.println("Opción incorrecta"); 
            }
        }
    }
    
}