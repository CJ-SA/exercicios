package org.example;
import java.util.Scanner;
// fiz no programiz, não tinha intellij nem visual code no meu pc.
class Main {
    public static void main(String[] args) { 
    
        Scanner sc = new Scanner (System.in);
        double[] temperatura = new double [10];
        int acimade = 0;
                for (int i = 0; i < 10; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + " em celsius: ");
            temperatura[i] = sc.nextDouble();
                    
                                
            if (temperatura[i] >= 30) {
                acimade = acimade + 1;
            } else{
              acimade = acimade + 0;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("quantidade de dias com temperatura acima de 30: " + acimade);
    }
}
