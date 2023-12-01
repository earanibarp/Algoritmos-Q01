package polimorfismo;


public class Main {
    public static void main(String[] args){
        Vehiculo vehiculos[] = new Vehiculo[4];
        
        vehiculos[0] = new Vehiculo("ASD-456", "Toyota", "Yaris");
        vehiculos[1] = new VehiculoCarga(500, "ASD-456", "Toyota", "Yaris");
        vehiculos[2] = new VehiculoCarreras(200, "ASD-456", "Toyota", "Yaris");
        vehiculos[3] = new VehiculoUrbano(4, "ASD-456", "Toyota", "Yaris");
        
        for(Vehiculo vehiculo: vehiculos){ //Clase o tipo de dato; nombre de variable iterativa; arreglo de objetos
            System.out.println(vehiculo.toString());
            
        }
    }
}
