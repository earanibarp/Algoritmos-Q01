package claseAbstracta;


public class Main {
    public static void main(String [] args){
        Cuadrado cuadradito = new Cuadrado(5, "Rojo");
        Triangulo triangulito = new Triangulo(2, 5, "Azul");
        
        System.out.println("El area del cuadrado es: " + cuadradito.calcularArea());
        System.out.println("El area del triangulo es: " + triangulito.calcularArea());
    }
}
