package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fale a temperatura em °C");
        double celsius= sc.nextDouble ();
        double faren = (celsius*9/5) + 32;
        System.out.println ("temperatura em farenheit\n" + faren + " °F");
    }
}
