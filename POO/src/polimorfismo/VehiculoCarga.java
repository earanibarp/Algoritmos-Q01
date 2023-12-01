package polimorfismo;


public class VehiculoCarga extends Vehiculo{
    //Atributos
    private int soporte; 
    
    //Metodos

    public VehiculoCarga(int soporte, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.soporte = soporte;
    }

    public int getSoporte() {
        return soporte;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSoporte=" + soporte;
    }
    
}
