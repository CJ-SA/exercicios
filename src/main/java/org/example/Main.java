package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);


        System.out.println("digite o valor da hora trabalhada: ");
        int n1 = sc.nextInt ();


        System.out.println("agora diga quantas horas foram trabalhadas nesse mês: ");
        int n2 = sc.nextInt ();


        int n3 = n1*n2;
        System.out.println("Seu salário este mês é de R$ " + n3 + ",00");
    }
}
