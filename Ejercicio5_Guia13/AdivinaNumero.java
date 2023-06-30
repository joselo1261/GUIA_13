package Ejercicio5_Guia13;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numAdivinar = random.nextInt(500) + 1;
        String verde = "\033[32m";
        System.out.println(verde+"Numero a Adivinar =>"+ numAdivinar);
        int intento = 0;

        System.out.println("\nADIVINA EL NUMERO");
        System.out.println("-----------------");
        System.out.println("El numero a adivinar debe estar entre 1 y 500");
        
        Scanner sc = new Scanner(System.in);
        boolean adivino = false;

        while (!adivino) {
            try {
                System.out.print("Igrese un numero: ");
                int numJugar = sc.nextInt();
                intento++;
                if (numJugar == numAdivinar) {
                    adivino = true;
                    System.out.println("Has adivinado el numero " + numAdivinar + " en " + intento + " intentos");
                } else if (numJugar < numAdivinar) {
                    System.out.println("El numero a adivinar es mayor que => " + numJugar);
                } else {
                    System.out.println("El numero a adivinar es menor que => " + numJugar);
                }
                } catch (InputMismatchException e) {
                intento++;
                System.out.println("Debe ingresar solo numeros");
                sc.nextLine();
                
                } 
        
        } sc.close();
}
}
