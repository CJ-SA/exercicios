package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dê o valor do lado (m)");
        double base= sc.nextDouble ();
        double area = base * base;
        System.out.println ("area do quadrado\n" + area + " m²");
    }
}
