package javalog;

import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {

        double promedio;
                String condicionFinal;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el promedio general del alumno: ");
        promedio = teclado.nextDouble();

        condicionFinal = promedio >=6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condicion final del alumno es: " + condicionFinal);


    }
}
