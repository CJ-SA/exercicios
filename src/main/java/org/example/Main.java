package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do produto:");
        double prod= sc.nextDouble ();
        System.out.println("digite a porcetagem do desconto:");
        double desc = sc.nextDouble();
        desc = desc /100;
        double valorReal= prod - (prod*desc);
        System.out.println ("Preço do produto com desconto:\n" + "R$" + valorReal );
    }
}
