package polimorfismo;


public class VehiculoUrbano extends Vehiculo{
    //Atributos
    private int nroPuertas;

    public VehiculoUrbano(int nroPuertas, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.nroPuertas = nroPuertas;
    }
    
    //Metodos

    public int getNroPuertas() {
        return nroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNroPuertas=" + nroPuertas;
    }
    
}
