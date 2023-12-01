package ejerciciosPOO;

public abstract class Poligono {

    //Atributos
    private int nroLados;

    //Metodos
    public Poligono(int nroLados) {
        this.nroLados = nroLados;
    }

    public int getNroLados() {
        return nroLados;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "\nNro de lados=" + nroLados;
    }

}
