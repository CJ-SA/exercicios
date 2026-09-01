package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);


        System.out.print("digite seu captital inicial: ");
        double capital = sc.nextDouble ();



        System.out.print("digite a taxa de juros [decimal]: ");
        double taxa = sc.nextDouble();


        System.out.print("digite o tempo [meses]: ");
        double tempo = sc.nextDouble();


        double juros = capital * taxa * tempo;
        System.out.println("Resultado: " + juros);

    }
}
