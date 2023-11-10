package encapsulamiento;

import java.util.Scanner;

public class Main {

    public static float mayorPerimetro(Cuadrilatero cuadrilateros[]) {
        float perimetro = 0;
        for(int i = 0; i < cuadrilateros.length; i++){
            if(cuadrilateros[i].calcularPerimetro() > perimetro){
                perimetro = cuadrilateros[i].calcularPerimetro();
            }
        }
        return perimetro;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float lado1, lado2;
        int nCuadrilateros;

        System.out.print("Ingrese la cantidad de cuadrilateros: ");
        nCuadrilateros = entrada.nextInt();

        Cuadrilatero cuadrilateros[] = new Cuadrilatero[nCuadrilateros];

        for (int i = 0; i < cuadrilateros.length; i++) {
            System.out.println("\nIngrese los valores del cuadrilatero " + (i + 1) + ": ");
            System.out.print("Ingresa el primer lado: ");
            lado1 = entrada.nextFloat();
            System.out.print("Ingresa el segundo lado: ");
            lado2 = entrada.nextFloat();

            if (lado1 == lado2) {
                cuadrilateros[i] = new Cuadrilatero(lado1);
            } else {
                cuadrilateros[i] = new Cuadrilatero(lado1, lado2);
            }
            System.out.print("\nEl área del cuadrilátero " + (i + 1) + " es: "
                    + cuadrilateros[i].calcularArea());
            System.out.println("\nEl perímetro del cuadrilatero " + (i + 1) + " es: "
                    + cuadrilateros[i].calcularPerimetro());
        }
        System.out.println("\nEl mayor perímetro es: " + mayorPerimetro(cuadrilateros));
    }
}
