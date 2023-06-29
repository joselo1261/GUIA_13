package Ejercicio3_Guia13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumeroMain {
   public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                DivisionNumero asd = new DivisionNumero();
                DivisionNumero asd2 = new DivisionNumero();
                System.out.println("Ingrese el primer numero");
                String num = sc.next();
                System.out.println("Ingrese el segundo numero");
                String num2 = sc.next();
                System.out.println("Ingrese otro numero");
                int num5 = sc.nextInt();
                int num3 = Integer.parseInt(num);
                int num4 = Integer.parseInt(num2);
                
                asd.division(num3, num4);
                asd2.division(num3, num5);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage() );
                System.out.println("Error: " + e);
                System.out.println(e.fillInStackTrace());
                System.out.println("No se puede dividir por 0");
            } catch (NumberFormatException e){
                System.out.println("Error: " + e.getMessage());
                System.out.println("Error: " + e);
                System.out.println(e.fillInStackTrace());
                System.out.println("Deben ser numeros, NO LETRAS Ã‘OÃ‘O");
            } catch (InputMismatchException e){
                System.out.println("Error: " + e.getMessage());
                System.out.println("Error: " + e);
                System.out.println(e.fillInStackTrace());
                System.out.println("Deber ser numerooooooos!! BLANDA!");
            } finally {
                System.out.println("Saliendo del program EGG! Aguante Belgrano!");
            }
        }

    }

}