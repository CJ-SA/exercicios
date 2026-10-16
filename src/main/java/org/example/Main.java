package org.example;
import java.util.Scanner;

public class Main {
    public static boolean verificarPar(int num) {
        return num % 2 ==0;
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int num = sc.nextInt();

        if (verificarPar(num)){
            System.out.println("True, " + num + " é par. ");
        }else {
            System.out.println("False," + num + " é ímpar.");
        }

    }
}