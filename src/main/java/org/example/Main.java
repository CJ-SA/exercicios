package com.example;
import java.io.*;
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String path = "C://Users//51459452801.SESISENAI//Downloads//controle_estoque(Sheet1) (1).csv";

        File eulirico = new File(path);

        if(eulirico.exists()){
            System.out.println("iniciando leitura.");
        }try(BufferedReader ArquivoBuffer = new BufferedReader(new FileReader(eulirico))){
            String linha;
            while ((linha= ArquivoBuffer.readLine())  !=null){
                String[] campos = linha.split(";");
                for (String campo : campos){
                    System.out.println(campo + "    |   ");
                }
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura de arquivo" + e.getMessage());
        }



    }
}