package polimorfismo;


public class VehiculoCarreras extends Vehiculo{
    //Atributos
    private int velocidad;
    
    //Metodos

    public VehiculoCarreras(int velocidad, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVelocidad=" + velocidad;
    }
    
    
}
