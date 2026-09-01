package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor, diga sua nota de ingles (10 a 0)");
        double nota1= sc.nextDouble ();
        System.out.println("por favor, diga sua nota de matemática (10 a 0)");
        double nota2= sc.nextDouble ();
        System.out.println("por favor, diga sua nota de portugues (10 a 0)");
        double nota3= sc.nextDouble ();
        double media = (nota1 + nota2 + nota3)/ 3;
        System.out.println ("média:\n" + media);

    }
}
