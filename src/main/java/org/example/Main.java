package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);





        System.out.print("digite a altura [m]: ");
        double alt = sc.nextDouble ();


        System.out.print("altura em metros: " + alt + "\naltura em centimetros: " + (alt * 100) + "\naltura em milimetros: " + (alt * 1000));
    }
}
