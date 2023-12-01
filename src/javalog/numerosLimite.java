package com.yas;

import java.util.Scanner;

public class numerosLimite {

    public static void main(String[] args) {

        System.out.println("Ingrese el limite hasta el que quiere contar: ");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int count = 1;

        while (count <=limite) {
            System.out.println(count);
            count = count+1;

        }
    }
}
