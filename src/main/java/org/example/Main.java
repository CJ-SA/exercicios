package org.example;
import java.util.Scanner;

public class Main {
    public static int dobrar(int num) {
        return num * 2 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = sc.nextInt();
        System.out.println("O dobro do valor é: " + dobrar(num));

    }
}