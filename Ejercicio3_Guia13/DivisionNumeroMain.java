package Ejercicio3_Guia13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumeroMain {

public static void main(String[] args) {
            
            boolean error = false;
            Scanner sc = new Scanner(System.in);
            DivisionNumero div1 = new DivisionNumero();
            DivisionNumero div2 = new DivisionNumero();

            do{
                try {
                System.out.print("\nIngrese el primer numero => ");
                String numStr = sc.next();
                int num = Integer.parseInt(numStr);
                System.out.print("Ingrese el segundo numero => ");
                String num1Str = sc.next();
                int num1 = Integer.parseInt(num1Str);
                System.out.print("Ingrese un tercer numero => ");
                int num2 = sc.nextInt();
                error=false;
                div1.division(num, num1);
                div2.division(num1, num2);

                } catch (ArithmeticException e) {
                    String amarillo = "\033[33m";
                System.out.println("\nTipo de Error:");
                System.out.println("..............");
                System.out.println(amarillo+"Error: " + e.getMessage() );
                System.out.println(amarillo+"Error: " + e);
                System.out.println(amarillo+e.fillInStackTrace());
                System.out.println("No se puede dividir por 0");
                error=true;
                } catch (NumberFormatException e){
                    String magenta = "\033[35m";
                System.out.println("\nTipo de Error:");
                System.out.println("..............");
                System.out.println(magenta+"Error: " + e.getMessage());
                System.out.println(magenta+"Error: " + e);
                System.out.println(magenta+e.fillInStackTrace());
                System.out.println("Deben ser numeros, No Otro Caracter");
                error=true;
                } catch (InputMismatchException e){
                    String celeste = "\033[36m";
                System.out.println("\nTipo de Error:");
                System.out.println("..............");
                System.out.println(celeste+"Error: " + e.getMessage());
                System.out.println(celeste+"Error: " + e);
                System.out.println(celeste+e.fillInStackTrace());
                System.out.println("Deben ser numeros, No Otro Caracter");
                error=true;
                } finally {
                System.out.println("Saliendo del programa");
                }
            } while (error);
            sc.close();
        }   
} 