package encapsulamiento.ejercicio3;

public class Paquete {

    // Atributos
    private int nroPaquete;
    private String dni;
    private double peso;
    private String prioridad; // Normal; Alta; Express

    //Mètodos

    public Paquete(int nroPaquete, String dni, double peso, String prioridad) {
        this.nroPaquete = nroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNroPaquete() {
        return nroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public String getPrioridad() {
        return prioridad;
    }
    
    public String mostrarDatosPaquete() {
        return "\nN° Paquete:" + nroPaquete
                + "DNI:" + dni
                + "Peso:" + peso
                + "Prioridad: " + prioridad;
    }
}
