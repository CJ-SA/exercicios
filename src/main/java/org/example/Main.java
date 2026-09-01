package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dê o valor da base (m)");
        double base= sc.nextDouble ();
        System.out.println("dê o valor da altura (m)");
        double altura = sc.nextDouble();
        double peri = base + altura + base + altura;
        System.out.println ("perimetro do retangulo\n" + peri + " m");
    }
}
