package encapsulamiento;

public class Persona {

    // Atributos
    private String nombre;
    private int edad;

    // Métodos
    // Métodos accesores -> get() y set()
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Juan"); // set() -> asignar
        persona1.setEdad(25);

        System.out.println("El nombre de la persona es " + persona1.getNombre()
                + " y la edad es " + persona1.getEdad()); //get() -> obtener
    }
}
