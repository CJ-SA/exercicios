package org.example;
import java.util.Scanner;

public class Main {
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double media = calcularMedia(n1, n2, n3);
        System.out.println("A média é: " + media);

    }
}