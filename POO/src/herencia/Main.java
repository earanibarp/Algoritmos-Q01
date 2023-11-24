package herencia;


public class Main {
    public static void main (String [] args){
        Alumno alumno1 = new Alumno(15, 10, "Juanito", 'M', 20);
        
        System.out.println("Los datos del alumno son: " + alumno1.mostrarDatos());
        
        Alumno alumno2 = new Alumno(18, 15, "Juanita", 'F', 20);
        
        System.out.println("\nLos datos del alumno son: " + alumno2.mostrarDatos());
    }
}
