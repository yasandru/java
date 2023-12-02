package javalog;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       /*Crea un array de 10 posiciones de números con valores pedidos por teclado.
        Muestra por consola el indice y el valor al que corresponde.
       Haz dos métodos, uno para rellenar valores y otro para mostrar.*/
        int num[] = new int[2];
        Scanner tec = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingresar el valor para el indice " + i);
            num[i] = tec.nextInt();



        }
        for (int i = 0; i < num.length; i++) {
            System.out.println("En el indice: "+ i + " esta el valor: " + num[i]);
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print("\t" + num[i]);
        }


    }
}
