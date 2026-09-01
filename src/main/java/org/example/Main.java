package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);


        System.out.print("digite o tempo em segundos: ");
        int seg = sc.nextInt ();

        int min = seg / 60;
        int hrs = min / 60;


        System.out.println("Resultado: " + hrs + " horas, " + (min % 60) + " minutos e " + (seg % 60) + " segundos.");
    }
}
