package ejerciciosPOO;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    static Scanner entradaT = new Scanner(System.in);
    static ArrayList<Poligono> poligonos = new ArrayList<>();
    
    public static void main(String [] args){
        //Llenar Poligonos
        llenarPoligonos();
        //Mostrar Poligonos
        mostrarDatos();
    }
    
    public static void llenarPoligonos(){
        int opc;
        char respuesta;
        do{
            do{
                System.out.println("\t**MENU**");
                System.out.println("1.- Ingresar Triángulo");
                System.out.println("2.- Ingresar Rectángulo");
                System.out.print("Ingrese la opción: ");
                opc = entradaT.nextInt();
                
                switch (opc) {
                    case 1: //Llenar un triángulo
                        llenarTriangulo();
                        break;
                    case 2: //Llenar un rectángulo
                        llenarRectangulo();
                        break;
                    default:
                        System.out.println("Opción incorrecta!");
                }
            }while(opc <  1 || opc > 2);
            
            System.out.println("¿Desea introducir otro poligono? S/N");
            respuesta = entradaT.next().charAt(0);
        }while(respuesta == 'S' || respuesta == 's');
    }
    
    public static void llenarTriangulo(){
        double base, altura;
        System.out.print("Ingrese la base: ");
        base = entradaT.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = entradaT.nextDouble();
        
        Triangulo triangulo = new Triangulo(base, altura);
        
        poligonos.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.print("Ingrese el lado 1: ");
        lado1 = entradaT.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        lado2 = entradaT.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligonos.add(rectangulo);
    }
    
    public static void mostrarDatos(){
        for(Poligono poli: poligonos){
            System.out.println(poli.toString());
            System.out.println("Area=" + poli.calcularArea());
        }
    }
}
