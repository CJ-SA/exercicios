package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);


        System.out.println("digite o valor do raio [cm]: ");
        double n1 = sc.nextDouble ();



        double pi = 3.14;


        double A = pi*(n1*n1);
        System.out.println("\nA área do círculo é de " + A + "cm²");
        System.out.println("\nEm metros, " + A/10000 + "m²\n");

    }
}
