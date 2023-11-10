package encapsulamiento.ejercicio1;

import java.util.Scanner;

public class Main {

    public static int vehiculoMasBarato(Vehiculo vehiculos[]) {
        int indice = 0;
        float precio = vehiculos[0].getPrecio();

        for (int i = 1; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio = vehiculos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String marca, modelo;
        float precio;
        int nVehiculos;

        System.out.print("Ingrese la cantidad de vehículos: ");
        nVehiculos = entrada.nextInt();

        Vehiculo vehiculos[] = new Vehiculo[nVehiculos];

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\nIngrese los valores del vehículo " + (i + 1) + ": ");
            entrada.nextLine();
            System.out.print("Ingresa la marca: ");
            marca = entrada.nextLine();
            System.out.print("Ingresa el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Ingresa el precio: ");
            precio = entrada.nextFloat();

            vehiculos[i] = new Vehiculo(marca, modelo, precio);
        }
        
        int indiceVehiculoBarato = vehiculoMasBarato(vehiculos);
        System.out.println("\nLos datos del vehículo más barato son: " 
                + vehiculos[indiceVehiculoBarato].mostrarDatosVehiculo());
    }
}
