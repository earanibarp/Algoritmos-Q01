package herencia.ejercicio;

public class Medico extends Persona {

    // Atributos
    private int nroColegiatura;
    private String especialidad;

    // M�todos
    public Medico(int nroColegiatura, String especialidad, String nombre, int edad, char sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroColegiatura = nroColegiatura;
        this.especialidad = especialidad;
    }

    public int getNroColegiatura() {
        return nroColegiatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double calcularPrecioConsulta() {
        /*si su especialidad es ?otorrino? su precio consulta ser� 40 soles, 
         si es ?traumatolog�a? su precio consulta ser� 45 soles, 
         si es ?dermatolog�a? su precio consulta ser� 50 soles, 
         otra especialidad ser� de 65 soles*/
        double precioConsulta;
        switch (especialidad.toLowerCase()) {
            case "otorrino":
                precioConsulta = 40;
                break;
            case "traumatologia":
                precioConsulta = 45;
                break;
            case "dermatologia":
                precioConsulta = 50;
                break;
            default:
                precioConsulta = 65;
        }
        return precioConsulta;
    }
}
