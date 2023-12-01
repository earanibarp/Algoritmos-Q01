package claseAbstracta;

public abstract class Figura {
    // Atributos
    private String color;
    
    // M�todos
    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public abstract double calcularArea();
}
