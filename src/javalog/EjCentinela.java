package com.yas;

import java.util.Scanner;

public class EjCentinela {

    public static void main(String[] args) {
/*cuando no sabemos la cantidad de algo que se va a ingresar es un bucle controlado por Centinela, de lo contrario es por Contador*/
        System.out.println("Ingrese una palabra: ");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();

        while (!palabra.equals("salir"))
        /*se traduce en que mientras la palabra no sea "salir", va a seguir corriendo infinitamente*/
            /*equalsIgnoreCase tambien se puede utilizar para ignorar la forma en la que el usuario ingrese una palabra (mayus/minus)*/
        {
            System.out.println("La palabra es: " + palabra);
            System.out.println("Si desea salir del programa ingrese la palabra 'salir'");
            System.out.println("Ingrese una palabra: ");
            palabra = teclado.next();

        }

    }
}
