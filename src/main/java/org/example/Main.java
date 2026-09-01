package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor, diga sua nota entre 0 a 100:");
        int nota = sc.nextInt();
        System.out.println("agora fale sua frequência em porcentagem:");
        int freq = sc.nextInt();
        boolean cond1 = (nota >= 80) && (freq >= 75);
        boolean cond2 = ((nota >= 50) && (nota <= 80)) || (freq >= 75);
        if (!cond2 && !cond1) {
            System.out.println("reprovado");
        } else if (cond1) {
            System.out.println("aprovado com B");
        } else if (cond2) {
            System.out.println("aprovado com R");
        }
    }
}
