package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner (System.in);
        File arquivo = new File ("exemplo.txt");
        if (arquivo.exists()) {

            System.out.println("arquivo já existe");
        } else {
            if (arquivo.createNewFile()){
                System.out.println("ARQUIVO CRIADO! " + arquivo.getName());
            } else
            {
                System.out.println("falha ao criar.");
            }
        }

    }
}
