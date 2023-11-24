package herencia;


public class Persona {
    // Atributos
    private String nombre; // protected -> los atributos son privados para todas las clases a excepci�n de las clases hijas
    private char sexo;
    private int edad;
    
    // M�todos

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    
}
