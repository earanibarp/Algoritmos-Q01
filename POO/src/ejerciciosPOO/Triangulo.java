package ejerciciosPOO;

public class Triangulo extends Poligono {

    //Atributos
    private double base;
    private double altura;

    //Metodos
    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase=" + base + "\nAltura=" + altura;
    }
}
