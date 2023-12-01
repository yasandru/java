package com.yas;

import java.util.Scanner;

public class Repetitivas {
    public static void main(String[] args) {
        //EjemploWhile
        /* int cont = 0;
        while (cont <=10) {
            System.out.println("Estoy en la vuelta: " + cont);
            cont = cont+1; */

        //EjemploFor
        /*for (int cont = 0;cont <= 10;cont++) {
            System.out.println("Estoy dando vueltas con FOR, estoy en la vuelta: "+ cont);
        }*/

        // ARRAYS
        // Declaración
        /* vector de 4 posiciones
        figura en indice la cantidad de posiciones -1 o 0 al 3*/
        int vector[] = new int[4];

        //Asignación (manual)
        /* En cada posición contiene el numero que se le asigna ej. el num 2 se encuentra en la posicion 0. */
        /*vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 346;*/

        //Asignacion por teclado
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el indice: " + i);
            vector[i] = teclado.nextInt();
            //Esto ultimo quiere decir que la posicion en el indice de mi vector el usuario debe ingresar por teclado un valor Int o entero.



        }

        //Recorrido del array(arreglo)
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice:" + i);
            System.out.println("Tengo guardado un:" + vector[i]);
            System.out.println("----------------------");
            //Lenght se utiliza para obtener la longitud del array


        }


    }


}
