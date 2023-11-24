package herencia;

public class Alumno extends Persona {

    // Atributos
    private int nota1;
    private int nota2;

    // Métodos
    public Alumno(int nota1, int nota2, String nombre, char sexo, int edad) {
        super(nombre, sexo, edad);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public double calcularPromedio() {
        double promedio = (nota1 + nota2) / 2;
        return promedio;
    }

    public String mostrarDatos() {
        return "\nNombre: " + getNombre()
                + "\nEdad: " + getEdad()
                + "\nPromedio: " + calcularPromedio();
    }
}
