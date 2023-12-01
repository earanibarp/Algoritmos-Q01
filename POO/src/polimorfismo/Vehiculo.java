package polimorfismo;

public class Vehiculo {

    //Atributos
    private String placa;
    private String marca;
    private String modelo;

    //Metodos
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "\nPlaca=" + placa + "\nMarca=" + marca + "\nModelo=" + modelo;
    }

}
