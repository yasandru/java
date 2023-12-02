package javalog;

import java.util.Scanner;
/*
*  Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9,
* al final muestra por pantalla el valor de cada posición y la suma de todos los valores.
* Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar),
* para mostrar el contenido y la suma del array y un método privado para generar número aleatorio
* (lo puedes usar para otros ejercicios).
* */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño: ");
        Scanner num = new Scanner(System.in);
        int size= num.nextInt();
        int numArray[] = new int[size];

        for (int i = 0; i < numArray.length; i++) {
            System.out.println("posicion: [" + i + "] = "+ numArray[i]);
        }
    }

}

