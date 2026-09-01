package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);


        System.out.print("digite seu peso [kg]: ");
        int n1 = sc.nextInt ();



        System.out.print("digite a altura [m]: ");
        int n2 = sc.nextInt();


        int n3 = n1/n2;
        System.out.println("Resultado: " + n3 + "\n resto da divisão: " + n1%n2);
    }
}
