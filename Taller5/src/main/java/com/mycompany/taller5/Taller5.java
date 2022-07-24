package com.mycompany.taller5;

import java.util.Scanner;


public class Taller5 {
    Scanner leer = new Scanner(System.in);
    String opcion, opcion1;
    private void seleccion(){
        do {            
            System.out.print("Digite una letra para mostrar el dia o digite 'exit' para salir: ");
            opcion= leer.nextLine();
            opcion1=opcion.toUpperCase();
            switch (opcion1) {
                case "D":
                    System.out.println("Domingo");
                    break;
                case "L":
                    System.out.println("Lunes");
                    break;
                case "K":
                    System.out.println("Martes");
                    break;
                case "M":
                    System.out.println("Miercoles");
                    break;
                case "J":
                    System.out.println("Jueves");
                    break;
                case "V":
                    System.out.println("Viernes");
                    break;
                case "S":
                    System.out.println("Sabado");
                    break;
                case "EXIT":
                    System.out.println("Gracias, saliendo...");
                    break;    
                
                default:
                    System.out.println("Letra no permitida");
            }
        } while (!"EXIT".equals(opcion1));
    }
    public static void main(String[] args) {
        Taller5 dia =new Taller5();
        dia.seleccion();
    }
}
