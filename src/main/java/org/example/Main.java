package org.example;
import java.util.Scanner;
// fiz no programiz, não tinha intellij nem visual code no meu pc.
class Main {
    public static void main(String[] args) { 
    
        Scanner sc = new Scanner (System.in);
        double[] setor = new double [12];
        double maiorConsumo = 0;
        int numSetor = 0;
                for (int i = 0; i < 12; i++) {
            System.out.print("Digite o consumo de água do setor " + (i + 1) + " em litros: ");
            setor[i] = sc.nextDouble();
                    
                                
            if (setor[i] > maiorConsumo) {
                maiorConsumo = setor[i];
                numSetor = i + 1;
            } else{
              maiorConsumo = maiorConsumo + 0;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("setor que consumiu mais água: " + numSetor + "\n Valor consumido: " + maiorConsumo + " litros");
    }
}
