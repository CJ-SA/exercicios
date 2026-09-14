package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);

        int qntcliente = 0;
        for (int cliente =1; cliente <=10; cliente++) {
            System.out.println("cliente " + cliente + ", informe sua nota de satisfação");
            double nota = sc.nextDouble();
            qntcliente = cliente;



        }
        System.out.println ("total: total de avaliações: " + qntcliente);

    }
}
