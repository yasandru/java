package javalog;

import java.util.Scanner;

public class EjercicioInmigrante {
    public static void main(String[] args) {
        System.out.println("Ingrese el dni de la persona: ");
        Scanner teclado = new Scanner(System.in);
        String dni = teclado.nextLine();
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        Scanner teclado2 = new Scanner(System.in);
        int edad = teclado.nextInt();
        /* "||" es or "&&" es and*/
        while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {
            /*Menores A ( 6 a 10 años)
             * Menores B (11 a 17 años)
             * Juveniles (18 a 30 años)
             * Adultos (31 a 50 años)
             * Adultos mayores (50 años o mas)*/

            if (edad >= 6 && edad <= 10) {
                System.out.println("La categoria es Menores A");
            } else {
                if (edad >= 11 && edad <= 17) {
                    System.out.println("La categoria es Menores B");
                } else {
                    if (edad >= 18 && edad <= 30) {
                        System.out.println("La categoria es Juveniles");
                    } else {
                        if (edad >= 31 && edad <= 50) {
                            System.out.println("La categoria es Adultos");
                        } else {
                            if (edad > 51) {
                                System.out.println("La categoria es Adultos Mayores");
                            } else {
                                if (edad < 5) {
                                    System.out.println("No puede participar del maraton");
                                }
                            }


                        }


                    }


                }

            }
        }
    }
}

