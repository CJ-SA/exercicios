package org.example;
import java.util.Scanner;

public class Main {
    public static double converterCF(double celsius) {
        return celsius * 1.8 + 32 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em celsius que deseja converter: ");
        double celsius = sc.nextDouble();
        double fahrenheit = converterCF(celsius);
        System.out.println("O valor em Fahrenheit é: " + fahrenheit);

    }
}