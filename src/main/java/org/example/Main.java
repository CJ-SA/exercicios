package com.example;
import java.io.FileWriter;
import java.io.IOException;
import  java.util.Scanner;
import java.io.File;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        File arquivo = new File ("exemplo.txt");

        try
        {
            if (arquivo.exists()) {
                System.out.println("O arquivo já existe. ");
            } else {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
                } else {
                    System.out.println("Falha ao criar arquivo. ");
                }
            }
        } catch (IOException e)
        {
            System.out.println("Falha ao manipular o arquivo.");
        }
        FileWriter eulirico = new FileWriter("exemplo.txt", true);
        eulirico.write("Boa ");
        eulirico.close();
    }
}