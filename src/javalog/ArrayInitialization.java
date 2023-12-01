package javalog;

public class ArrayInitialization {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        double[] doubleArray = new double[5];
        char[] charArray = new char[5];
        boolean[] booleanArray = new boolean[5];
        Object[] objectArray = new Object[5];

        System.out.println("Default values for intArray:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nDefault values for doubleArray:");
        for (double d : doubleArray) {
            System.out.print(d + " ");
        }

        System.out.println("\nDefault values for charArray:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nDefault values for booleanArray:");
        for (boolean b : booleanArray) {
            System.out.print(b + " ");
        }

        System.out.println("\nDefault values for objectArray:");
        for (Object o : objectArray) {
            System.out.print(o + " ");
        }
    }
}
