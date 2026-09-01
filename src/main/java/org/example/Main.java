package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);


        System.out.println("digite o valor de A: ");
        double n1 = sc.nextDouble ();
        double n3 = n1;


        System.out.println("digite o valor de B: ");
        double n2 = sc.nextDouble ();


        n1 = n2;
        System.out.println("O valor de A foi atualizado para o valor de B: " + n1);
        n2 = n3;


        System.out.println("O valor de B foi atualizado para o valor de A: " + n2);
    }
}
