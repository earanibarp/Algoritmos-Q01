package ejerciciosPOO;


public class Rectangulo extends Poligono{
    //Atributos
    private double lado1;
    private double lado2;
    
    //Metodos

    public Rectangulo(double lado1, double lado2) {
        super(4);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
    
    @Override
    public double calcularArea(){
        double area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLado 1=" + lado1 + "'\nLado 2=" + lado2;
    }
    
    
}
