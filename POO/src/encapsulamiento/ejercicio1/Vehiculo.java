package encapsulamiento.ejercicio1;

public class Vehiculo {

    // Atributos
    private String marca;
    private String modelo;
    private float precio;

    //Métodos
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatosVehiculo() {
        return "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nPrecio: $" + precio;
    }

}
