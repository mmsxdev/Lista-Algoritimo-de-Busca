package org.example.Exercicios.Exercicio1;

import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner busca = new Scanner(System.in);

        int[] v = new int[80];

        for (int i = 0; i < 80; i++) {
            v[i] = i + 1;
        }

        System.out.print("Digite um número: ");
        int num = busca.nextInt();

        boolean achou = false;

        for (int i = 0; i < 80; i++) {
            if (v[i] == num) {
                System.out.println("Encontrado na posição: " + i);
                achou = true;
                break;
            }
        }

        if (!achou) {
            System.out.println("Não encontrado");
        }

        busca.close();
    }
}
