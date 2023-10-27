/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseYObjeto;

/**
 *
 * @author earanibarp
 */
public class Principal {

    public static void main(String[] args) {
        // Objeto 1
        Persona persona1 = new Persona();

        persona1.pedirDatos();
        persona1.mostrarDatos();

        // Objeto 2
        Persona persona2 = new Persona();

        persona2.nombre = "Fabian";
        persona2.edad = 20;
        persona2.mostrarDatos();

        // Objeto 3
        Persona persona3 = new Persona("Juanito", 19);

        persona3.mostrarDatos();
    }
}
