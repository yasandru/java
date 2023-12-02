package javalog;

public class Matrices {
    public static void main(String[] args) {
        //Declaracion filas y columnas
        int matriz[][] = new int[3][3];

        //Asignacion manual
        matriz[0][0] = 5;
        matriz[0][1] = 47;
        matriz[0][2] = 8;

        //Recorrido
        //fila
        for (int f = 0; f < 3; f++) {
            //columna
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posicion f: " + f + "c: " + c);
                System.out.println("es de: "+ matriz[f][c]);

            }


        }


    }

}
