package herencia.ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {

    public static int buscarNroHistoriaPaciente(ArrayList<Paciente> pacientes, int nroHistoria) {
        int indice = 0;
        boolean encontrado = false;
        for (int i = 0; i <= pacientes.size(); i++) {
            if (pacientes.get(i).getNroHistoria() == nroHistoria) {
                indice = i;
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entradaT = new Scanner(System.in);
        String nombrePaciente, fechaConsultaPaciente, nombreMedico, especialidadMedico;
        double pesoPaciente, alturaPaciente, pesoMedico, alturaMedico;
        char sexoPaciente, sexoMedico;
        int edadPaciente, nroHistoriaPaciente, edadMedico, nroColegiaturaMedico, opc,
                indicePaciente, opcMedico;

        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();

        do {
            System.out.println("\t -MENU-");
            System.out.println("1. Registrar nuevo paciente");
            System.out.println("2. Registrar nuevo médico");
            System.out.println("3. Registrar nueva consulta");
            System.out.println("4. Salida");
            System.out.print("Ingrese la opción a realizar: ");
            opc = entradaT.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese el nombre del paciente: ");
                    nombrePaciente = entradaT.nextLine();
                    System.out.print("Ingrese la edad del paciente: ");
                    edadPaciente = entradaT.nextInt();
                    System.out.print("Ingrese el sexo del paciente: ");
                    sexoPaciente = entradaT.next().charAt(0);
                    System.out.print("Ingrese el peso del paciente: ");
                    pesoPaciente = entradaT.nextDouble();
                    System.out.print("Ingrese la altura del paciente: ");
                    alturaPaciente = entradaT.nextDouble();
                    System.out.print("Ingrese el nro de historia del paciente: ");
                    nroHistoriaPaciente = entradaT.nextInt();
                    System.out.print("Ingrese el la fecha de consulta del paciente (año-mes-dia): ");
                    fechaConsultaPaciente = entradaT.next();

                    pacientes.add(new Paciente(nroHistoriaPaciente,
                            fechaConsultaPaciente, nombrePaciente,
                            edadPaciente, sexoPaciente, pesoPaciente, alturaPaciente));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del medico: ");
                    nombreMedico = entradaT.nextLine();
                    System.out.print("Ingrese la edad del medico: ");
                    edadMedico = entradaT.nextInt();
                    System.out.print("Ingrese el sexo del medico: ");
                    sexoMedico = entradaT.next().charAt(0);
                    System.out.print("Ingrese el peso del medico: ");
                    pesoMedico = entradaT.nextDouble();
                    System.out.print("Ingrese la altura del medico: ");
                    alturaMedico = entradaT.nextDouble();
                    System.out.print("Ingrese el nro de colegiatura del medico: ");
                    nroColegiaturaMedico = entradaT.nextInt();
                    System.out.print("Ingrese la especialidad del medico: ");
                    especialidadMedico = entradaT.next();

                    medicos.add(new Medico(nroColegiaturaMedico,
                            especialidadMedico, nombreMedico,
                            edadMedico, sexoMedico, pesoMedico, alturaMedico));
                    break;
                case 3:
                    System.out.print("Ingrese el nro de historia del paciente: ");
                    nroHistoriaPaciente = entradaT.nextInt();
                    indicePaciente = buscarNroHistoriaPaciente(pacientes, nroHistoriaPaciente);

                    if (indicePaciente == -1) {
                        System.out.println("Paciente no encontrado");
                    } else {
                        System.out.println("Consulta para el paciente: " + pacientes.get(indicePaciente).getNombre());
                        System.out.println("Médicos disponibles: ");

                        for (int i = 0; i <= medicos.size(); i++) {
                            System.out.println((i + 1) + ". " + medicos.get(i).getNombre()
                                    + " - " + medicos.get(i).getEspecialidad());
                        }
                        System.out.println("Ingrese el médico seleccionado: ");
                        opcMedico = entradaT.nextInt();
                        if (opcMedico > 0 && opcMedico <= medicos.size()) {
                            System.out.println("Consulta asignada para el médico" + medicos.get(opcMedico - 1).getNombre());
                            System.out.println("Precio de la consulta: " + medicos.get(opcMedico - 1).calcularPrecioConsulta());
                        } else {
                            System.out.println("Opción no válida");
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción incorrecta, ingrese una opción del menú.");
                    ;
            }
        } while (opc != 4);
    }
}
