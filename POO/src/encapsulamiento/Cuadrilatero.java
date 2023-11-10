package encapsulamiento;


public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    
    // Métodos

    // Constructor para un cuadrado
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public float calcularArea(){
        float area = lado1 * lado2;
        return area;
    }
    
    public float calcularPerimetro(){
        float perimetro = (lado1 + lado2) * 2;
        return perimetro;
    }
}
