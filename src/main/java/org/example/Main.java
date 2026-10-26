package com.example;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import  java.util.Scanner;
import java.io.File;


public class Main {
    public static void main(String[] args) throws IOException {
    File arquivo = new File("teste.txt");

        if (arquivo.exists()) {
        System.out.println("Arquivo já existe");

    } else {
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Criado com sucesso");
            } else {
                System.out.println("Deu ruim!");
            }
        } catch (IOException e) {
            System.out.println("Windows não deixou :(");
        }
    }

        try {

        FileWriter escritor = new FileWriter("teste.txt", false);
        escritor.write("Ola\n");
        escritor.close();
        System.out.println("Frase escrita com sucesso!");
    } catch (IOException e) {
        System.out.println("Windows não deixou escrever");
    }


        if (arquivo.exists()) {
        System.out.println("\nLendo o arquivo:");
        try {
            FileReader leitor = new FileReader("teste.txt");
            int letra;
            while ((letra = leitor.read()) != -1) {
                System.out.print((char) letra);
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Windows não deixou :(");
        }
    } else {
        System.out.println("Arquivo não encontrado");
    }
}
}