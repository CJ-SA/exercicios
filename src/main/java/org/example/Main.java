package org.example;
import java.util.Scanner;
// fiz no programiz, não tinha intellij nem visual code no meu pc.
class Main {
    public static void main(String[] args) { 
    
        Scanner sc = new Scanner (System.in);
        double[] producao = new double [7];
        double total = 0;
        double maiorProducao = 0;
                for (int i = 0; i < 7; i++) {
            System.out.print("Digite a produção da semana " + (i + 1) + " em toneladas: ");
            producao[i] = sc.nextDouble();
                    total += producao[i];
                                
            if (producao[i] > maiorProducao) {
                maiorProducao = producao[i];
            } else{
              maiorProducao = maiorProducao + 0;
            }
        }
        double media = total/7;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Produção total: " + total + " toneladas");
        System.out.println("Média semanal: " + media + " toneladas");
        System.out.println("Maior produção: " + maiorProducao + " toneladas");
    }
}
