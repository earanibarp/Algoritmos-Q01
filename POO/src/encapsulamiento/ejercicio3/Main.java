package encapsulamiento.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int buscarSucursal(ArrayList<Sucursal> sucursales, int nroSucursal) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < sucursales.size(); i++) {
            if (sucursales.get(i).getNroSucursal() == nroSucursal) {
                indice = i;
                encontrado = true;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static int buscarPaquete(ArrayList<Paquete> paquetes, int nroPaquete) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < paquetes.size(); i++) {
            if (paquetes.get(i).getNroPaquete() == nroPaquete) {
                indice = i;
                encontrado = true;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);

        int nroSucursal, nroPaquete, opc, indiceSucursal, nPaquetes, indicePaquete;
        String direccion, ciudad, dni, prioridad;
        double peso, precioPaquete;

        ArrayList<Sucursal> sucursales = new ArrayList<>();
        ArrayList<Paquete> paquetes = new ArrayList<>();
        do {
            System.out.println("\n\t**MENU**");
            System.out.println("1.- Crear nueva sucursal");
            System.out.println("2.- Enviar paquete");
            System.out.println("3.- Consultar sucursal");
            System.out.println("4.- Consultar paquete");
            System.out.println("5.- Mostrar todas las sucursales");
            System.out.println("6.- Mostrar todos los paquetes");
            System.out.println("7.- Salir");
            System.out.print("Ingrese la opción a realizar: ");
            opc = entradaT.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese el número de sucursal: ");
                    nroSucursal = entradaT.nextInt();
                    entradaT.nextLine();
                    System.out.print("Ingrese la dirección: ");
                    direccion = entradaT.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    ciudad = entradaT.nextLine();
                    
                    sucursales.add(new Sucursal(nroSucursal, direccion, ciudad));
                    break;
                case 2:
                    System.out.print("Ingrese el número de sucursal: ");
                    nroSucursal = entradaT.nextInt();
                    entradaT.nextLine();

                    indiceSucursal = buscarSucursal(sucursales, nroSucursal);

                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe!");
                    } else {
                        System.out.print("Ingrese el número de paquete: ");
                        nroPaquete = entradaT.nextInt();
                        entradaT.nextLine();
                        System.out.print("Ingrese el DNI de la persona: ");
                        dni = entradaT.nextLine();
                        System.out.print("Ingrese el peso del paquete: ");
                        peso = entradaT.nextFloat();
                        System.out.print("Ingrese la prioridad (Normal, Alta, Express): ");
                        prioridad = entradaT.nextLine();

                        paquetes.add(new Paquete(nroPaquete, dni, peso, prioridad));
                        precioPaquete = sucursales.get(indiceSucursal).calcularPrecioPaquete(paquetes.get(paquetes.size() - 1)); // paquetes.size() -1 obtiene el último paquete añadiro al ArrayList

                        System.out.println("\nEl precio del paquete es: " + precioPaquete);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el número de sucursal: ");
                    nroSucursal = entradaT.nextInt();

                    indiceSucursal = buscarSucursal(sucursales, nroSucursal);

                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe!");
                    } else {
                        System.out.println("Los datos de la sucursal son: " + sucursales.get(indiceSucursal).mostrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el número de paquete: ");
                    nroPaquete = entradaT.nextInt();

                    indicePaquete = buscarPaquete(paquetes, nroPaquete);

                    if (indicePaquete == -1) {
                        System.out.println("El paquete no existe!");
                    } else {
                        System.out.println("Los datos del paquete son: " + paquetes.get(indicePaquete).mostrarDatosPaquete());
                    }
                    break;
                case 5:
                    System.out.println("\nLas sucursales son: ");
                    for(int i = 0; i < sucursales.size(); i++){
                        System.out.println(sucursales.get(i).mostrarDatosSucursal());
                    }
                    break;
                case 6:
                    System.out.println("\nLos paquetes son: ");
                    for(int i = 0; i < paquetes.size(); i++){
                        System.out.println(paquetes.get(i).mostrarDatosPaquete());
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción incorrecta, selecciona una opción que se encuentre en el menú.");
            }
        } while (opc != 7);

    }
}
