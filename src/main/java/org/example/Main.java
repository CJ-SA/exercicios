package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);


        System.out.println("diga quantos kilometros o carro consegue percorrer com o tanque cheio: ");
        int n1 = sc.nextInt ();


        System.out.println("agora diga quantos litros tem o tanque: ");
        int n2 = sc.nextInt ();


        int n3 = n1/n2;
        System.out.println("Seu carro faz " + n3 + " Km/l de combustivel");
    }
}
