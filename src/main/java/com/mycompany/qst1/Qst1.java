/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qst1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Siqueira
 */
public class Qst1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> nomes = new ArrayList<>();
            
            // Ler quantidade de nomes
            int qtd = 0;
            while (true) {
                try {
                    System.out.print("Informe quantos nomes você quer cadastrar: ");
                    qtd = scanner.nextInt();
                    scanner.nextLine(); 
                    if (qtd <= 0) {
                        System.out.println("Só é possivel prosseguir se a quantidade inserida for um número positivo.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Inválido. Digite um número inteiro.");
                    scanner.nextLine();  
                }
            }
            
            // Ler os nomes
            for (int n = 0; n < qtd; n++) {
                String nome = "";
                while (nome.trim().isEmpty()) {
                    System.out.print("Insira o nome " + (n + 1) + ": ");
                    nome = scanner.nextLine();
                    if (nome.trim().isEmpty()) {
                        System.out.println("Não é possível prosseguir se for vazio. Insira um nome.");
                    }
                }
                nomes.add(nome);
            }
            
            // Verificação de posição
            while (true) {
                try {
                    System.out.print("Insira o número da posição que você gostaria de consultar (1 a " + qtd + "): ");
                    int posicao = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    if (posicao < 1 || posicao > qtd) {
                        System.out.println("Número inválido. Deve estar entre ads posições 1 e " + qtd + ".");
                    } else {
                        System.out.println("Nome na posição " + posicao + ": " + nomes.get(posicao - 1));
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Inválido. Digite um número inteiro.");
                    scanner.nextLine();  
                }
            }
        }
    }
}
