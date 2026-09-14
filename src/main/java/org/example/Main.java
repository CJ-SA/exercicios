package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);

        double total = 0;
        for (int venda =1; venda <=5; venda++) {
            System.out.println("digite o preço da venda" + venda);
            double valor = sc.nextDouble();
            total += valor;



        }
        System.out.println ("total: R$" + total);

    }
}
