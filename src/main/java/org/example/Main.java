package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);

        int peca = 1;
        for (int contador =1; contador <=20; contador++) {
            System.out.println("peça " + peca + " produzida.");
            peca = peca + 1 ;
        }

    }
}
