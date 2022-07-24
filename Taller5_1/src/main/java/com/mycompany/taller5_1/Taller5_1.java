package com.mycompany.taller5_1;

import java.util.Scanner;

public class Taller5_1 {
    private Scanner leer;
    private int [][] matriz;
    public void cargarDatos(){
        leer =new Scanner (System.in);
        matriz = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese los elementos de la matriz: ["+i+"]["+j+"] : ");
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    public void imprimirDiagonalSecundaria(){
        for (int k = 0;k< matriz.length; k++) {
            for (int l = 0; l < matriz.length; l++) {
                if ((k+l)==(matriz.length-1)) {
                    System.out.print(matriz[k][l]+" ");
                }
            }
        }
    }
        
    public static void main(String[] args) {
        Taller5_1 cons= new Taller5_1();
        cons.cargarDatos();
        cons.imprimirDiagonalSecundaria();
    }
}
