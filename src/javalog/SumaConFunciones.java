package com.yas;

//Crear una funcion que acepte dos valores ingresados por teclado y retorne la suma

import java.util.Scanner;

//crear una funcion que acepte dos valores enteros y me devuelva la resta del primero menos el segundo
public class SumaConFunciones {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int primerNum = var.nextInt();
        System.out.println("Ingrese el segundo número");
        int segundoNum = var.nextInt();
        int resultadoSuma = SumaConFunciones.Sumar(primerNum, segundoNum);
        int restarTotal = SumaConFunciones.Restar(primerNum, segundoNum);

        System.out.println("El resultado de la suma es: ");
        System.out.println(resultadoSuma);
        System.out.println("El total de la resta es:");
        System.out.println(restarTotal);
    }
        public static int Sumar(int x, int y){
            return x + y;
        }
        public static int Restar(int x, int y){
            return x - y;
        }
    }