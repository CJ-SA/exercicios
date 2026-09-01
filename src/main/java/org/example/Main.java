package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);


        System.out.print("digite seu peso [kg]: ");
        double peso = sc.nextDouble ();



        System.out.print("digite sua altura [m]: ");
        double alt = sc.nextDouble ();


        double IMC = peso / (alt * alt);
        System.out.println("Seu IMC é: " + IMC);
    }
}
