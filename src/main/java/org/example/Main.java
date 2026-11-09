package com.example;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        String dataAtual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("/C://Users/Downloads/ativos.csv/"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("inventario_auditado.csv"));

            String linha = leitor.readLine();
            escritor.write(linha + ", data_auditoria");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];
                int criticidade = 0;
                if ((so.contains("linux") || so.contains("ubuntu") || so.contains("debian") || so.contains("rocky") || so.contains("kali"))){
                    criticidade = criticidade + 7;
                } else if ((so.contains("windows"))){
                    criticidade = criticidade + 5;
                } else if (so.contains("mac")|| so.contains("macOS")){
                    criticidade = criticidade + 3;
                }

                escritor.write(host + ", " + ip + ", " + so + ", " + dataAtual + ", risco: " + criticidade);
                escritor.newLine();
            }

            leitor.close();
            escritor.close();

            System.out.println("Relatório com data de auditoria gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}