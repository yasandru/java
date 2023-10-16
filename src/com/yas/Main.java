package com.yas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. tenés que leer elingreso del teclado
Scanner variableNum = new Scanner(System.in);
        System.out.println("Ingresar primer valor:");
        int num1;
        num1= variableNum.nextInt();
        System.out.println("Ingresar segundo valor:");
        int num2;
        num2= variableNum.nextInt();
        int total =num1+num2;
        System.out.println(total);
        //1.1. Poner un mensaje para el usuario

        //2. Como necesito la suma de dos num, creo otra variable para el sig num y pongo un mensaje para el usuario

        //MOstrar suma

        //String h = "Hola Tofu";
        //String p = Main.retornameLoQueTemando(h);

    }

    public static String retornameLoQueTemando(String pipo) {
        pipo.concat("tkm");
        String v = pipo.concat("tkm"); //Hola Tofu tkm
        v.concat("tkm2"); //Hola Tofu tkmtkm2

        String tkm = "tkm";
        String tkm2 = "tkm2";
        String concatTkm = tkm.concat(tkm2);

        return pipo.concat(concatTkm);

    }


}

