package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do real:");
        double real= sc.nextDouble ();

        double dolar = real*0.1941;


        System.out.println ("valor do real convertido em dolar:\n" + "U$" + dolar );
    }
}
