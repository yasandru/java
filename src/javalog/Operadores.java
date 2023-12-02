package javalog;

import java.util.Scanner;

public class Operadores {
    public static  void main(String[] args) {
        Scanner VariableOp = new Scanner(System.in);
        System.out.println("Primer num:");
        int NumberOne = VariableOp.nextInt();
        System.out.println("Segundo num:");
        int NumberTwo = VariableOp.nextInt();
        int restar = NumberOne-NumberTwo;
        System.out.println("restar"+ restar);
        System.out.println("Multiplicación del último resultado:");
        int Multiplicar = VariableOp.nextInt();
        System.out.println(restar*Multiplicar);
        System.out.println("División del último resultado:");
        int División = VariableOp.nextInt();
        System.out.println(Multiplicar/División);
        System.out.println("Resto del último resultado:");
        int Resto = VariableOp.nextInt();
        System.out.println(División%Resto);
    }
}
