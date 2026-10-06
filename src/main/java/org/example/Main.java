package org.example;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int soma = 0;
        int[] valores = {20, 30, 40, 50, 60};
        for (int i = 0; i < valores.length; i++) {
            soma = soma + valores[i];


        }
        for (int i = 0; i < valores.length - 1; i++){
            System.out.println(valores[i]);
        }

        System.out.println("é igual à " + soma);
    }
}
