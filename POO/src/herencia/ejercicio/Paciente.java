package herencia.ejercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente extends Persona {

    // Atributos
    private int nroHistoria;
    private Date fechaPrimeraConsulta;

    // Métodos
    public Paciente(int nroHistoria, String fechaPrimeraConsulta, String nombre, int edad, char sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroHistoria = nroHistoria;

        // Convertir fecha (String) a formato de fecha (Date)
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        try {
            this.fechaPrimeraConsulta = sdf.parse(fechaPrimeraConsulta);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public int getNroHistoria() {
        return nroHistoria;
    }

    public Date getFechaPrimeraConsulta() {
        return fechaPrimeraConsulta;
    }

    public String calcularIMC() {
        /*si está por debajo de 18.5 su nivel es ?Bajo de peso", 
        si está en 18.5 ? 24.9 su nivel es "Normal", 
        si está en 25.0 ? 29.9 su nivel es "Sobrepeso", 
        si está en 30.0 o más su nivel es "Obeso".
         */
        double imc = getPeso() / (getAltura() * getAltura());

        if (imc <= 18.5) {
            return "Bajo de peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}
