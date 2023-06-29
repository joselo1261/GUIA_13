package Ejercicio2_Guia13;

import java.util.Scanner;

// Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
// generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
// de rango).

public class ArrayDesbordado {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int edades[]= {10,20,30,40};
        try {
            System.out.print("\nIngrese posicion edad a buscar => ");
            int posic=sc.nextInt();
            System.out.println("La edad de la persona es: " + edades[posic]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de Rango");
            System.out.println("\nTipo de Error:");
            System.out.println("..............");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e);
            System.out.println(e.fillInStackTrace());
            System.out.println(" ");

             
        }
    }
     
}
}