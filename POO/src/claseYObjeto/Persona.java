package claseYObjeto;

import javax.swing.JOptionPane;

public class Persona {

    // Atributos
    String nombre;
    int edad;

    //Métodos
    // Método constructor: sirven para inicializar los atributos de una clase
    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void pedirDatos() {
        nombre = JOptionPane.showInputDialog("Ingresa el nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));
    }

    public void mostrarDatos() {
        System.out.println("El nombre es " + nombre + " y la edad es " + edad);
    }

}
