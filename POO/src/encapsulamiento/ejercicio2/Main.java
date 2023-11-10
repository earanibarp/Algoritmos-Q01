package encapsulamiento.ejercicio2;

import java.util.Scanner;

public class Main {

    public static int buscarNroCuenta(Cuenta cuentas[], int nroCuenta) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].getNroCuenta() == nroCuenta) {
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

        String nombre, apellido, dni;
        int nroCuenta, nCuentas, opc, indiceCuenta;
        float saldo, cantidad;

        Cuenta cuentas[];
        Cliente cliente;

        System.out.print("Ingrese el nombre del cliente: ");
        nombre = entradaT.nextLine();
        System.out.print("Ingrese el apellido del cliente: ");
        apellido = entradaT.nextLine();
        System.out.print("Ingrese el DNI del cliente: ");
        dni = entradaT.nextLine();
        System.out.print("Ingrese la cantidad de cuentas: ");
        nCuentas = entradaT.nextInt();

        cuentas = new Cuenta[nCuentas];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nIngrese los datos de la cuenta " + (i + 1) + ": ");
            System.out.print("Ingresa el nro de cuenta: ");
            nroCuenta = entradaT.nextInt();
            System.out.print("Ingresa el saldo de la cuenta: ");
            saldo = entradaT.nextFloat();

            cuentas[i] = new Cuenta(nroCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do {
            System.out.println("\t **MENU**");
            System.out.println("1.- Depositar dinero");
            System.out.println("2.- Retirar dinero");
            System.out.println("3.- Consultar saldo");
            System.out.println("4.- Salir");
            System.out.print("Ingrese la opción de la operación que desea realizar: ");
            opc = entradaT.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\nIngresa el nro de Cuenta: ");
                    nroCuenta = entradaT.nextInt();
                    indiceCuenta = buscarNroCuenta(cuentas, nroCuenta);
                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado no existe o es incorrecto!");
                    } else {
                        System.out.print("Ingrese la cantidad de dinero a depositar: ");
                        cantidad = entradaT.nextFloat();

                        cliente.depositarDinero(indiceCuenta, cantidad);
                        System.out.println("\nDepósito realizado con éxito!");
                        System.out.println("Saldo actual: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 2:
                    System.out.print("\nIngresa el nro de Cuenta: ");
                    nroCuenta = entradaT.nextInt();
                    indiceCuenta = buscarNroCuenta(cuentas, nroCuenta);
                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado no existe o es incorrecto!");
                    } else {
                        System.out.print("Ingrese la cantidad de dinero a retirar: ");
                        cantidad = entradaT.nextFloat();

                        if (cantidad > cliente.consultarSaldo(indiceCuenta)) {
                            System.out.println("\nSaldo insuficiente");
                        } else {
                            cliente.retirarDinero(indiceCuenta, cantidad);
                            System.out.println("\nRetiro realizado con éxito!");
                            System.out.println("Saldo actual: " + cliente.consultarSaldo(indiceCuenta));
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nIngresa el nro de Cuenta: ");
                    nroCuenta = entradaT.nextInt();
                    indiceCuenta = buscarNroCuenta(cuentas, nroCuenta);
                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado no existe o es incorrecto!");
                    } else {
                        System.out.println("Saldo actual: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 4: break;
                default:
                    System.out.println("\nOpción inválida, ingrese una opción que se encuentra en el menú.");;
            }
        } while (opc != 4);
    }
}
