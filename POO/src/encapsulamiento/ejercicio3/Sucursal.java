package encapsulamiento.ejercicio3;

public class Sucursal {

    //Atributos
    private int nroSucursal;
    private String direccion;
    private String ciudad;

    // Métodos
    public Sucursal(int nroSucursal, String direccion, String ciudad) {
        this.nroSucursal = nroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNroSucursal() {
        return nroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    } 

    public String mostrarDatosSucursal() {
        return "\nNroSucursal:" + nroSucursal
                + "\nDireccion: " + direccion
                + "\nCiudad: " + ciudad;
    }
    
    public double calcularPrecioPaquete(Paquete paquete){ //Este método viene aquí porque el ejercicio indica que la sucursal asigna los precios de los paquetes
        double precioPaquete = paquete.getPeso(); // Precio = S/.1.00 por kg
        if(paquete.getPrioridad().equalsIgnoreCase("Alta")){
            precioPaquete += 10;
        }
        
        if(paquete.getPrioridad().equalsIgnoreCase("Express")){
            precioPaquete += 20;
        }
        
        return precioPaquete;
    }
}
