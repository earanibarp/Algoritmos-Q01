package claseYObjeto;

import javax.swing.JOptionPane;

/**
 *
 * Crear una clase Obrero en Java con los atributos: código, nombre, 
 * horas trabajadas y tarifa por hora; y las operaciones: salarioBruto(). 
 * Para hallar el bruto debe calcular las horas por su tarifa.
 */
public class Obrero {
    // Atributos 
    String codigo, nombre;
    int horasT;
    double tarifaXHora;
    
    // Métodos / Operaciones
    
    public Obrero(){
    }

    public Obrero(double tarifaXHora) {
        this.tarifaXHora = tarifaXHora;
    }

    public double salarioBruto() {
        double salario = horasT * tarifaXHora;
        return salario;
    }
    
    public static void main(String [] args){
        Obrero ob1 = new Obrero(21.5);
        
        ob1.nombre = JOptionPane.showInputDialog("Ingresa el nombre");
        ob1.horasT = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas"));
        
        System.out.println(ob1.nombre + " tu salario es: " + ob1.salarioBruto());
    }
}
