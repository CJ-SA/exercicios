package com.example;
import java.io.*;
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String path = "C:/Users//Downloads/ativos.csv";

        File eulirico = new File(path);

        if (eulirico.exists()) {
            System.out.println("iniciando leitura.");
        }
        try (BufferedReader ArquivoBuffer = new BufferedReader(new FileReader(eulirico))) {
            String linha;
            int firewall = 0;
            int windows = 0;
            int linux = 0;
            while ((linha = ArquivoBuffer.readLine()) != null) {
                String[] campos = linha.split(",");
                String host = campos[0];
                String ip = campos[1];
                String sistema = campos[2];

                if (sistema.startsWith("Windows")) {
                    windows = windows + 1;

                } else if (sistema.startsWith("Linux")) {
                    linux = linux + 1;

                } else if (sistema.startsWith("Storage")) {
                    firewall = firewall + 1;
                }

                System.out.println("-----------------");
                System.out.println("host: " + host);
                System.out.println("Ip: " + ip);
                System.out.println("Sistema: " + sistema);

            }
            System.out.println("==========TIPOS DE SISTEMAS==========");
            System.out.println("firewall : " + firewall);
            System.out.println("windows: " + windows);
            System.out.println("linux: " + linux);
        } catch(IOException e){
                System.out.println("Erro na leitura de arquivo" + e.getMessage());
            }


        }
    }
