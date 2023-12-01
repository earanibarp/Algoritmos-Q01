package claseAbstracta;


public class Triangulo extends Figura{
    //Atributos
    private double base;
    private double altura;
    
    //Metodos

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    @Override //Sobreescritura de métodos
    public double calcularArea(){
        double area = (base * altura)/2;
        return area;
    }
}
