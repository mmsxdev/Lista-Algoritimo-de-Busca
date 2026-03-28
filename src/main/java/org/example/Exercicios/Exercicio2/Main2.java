package org.example.Exercicios.Exercicio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[]{9, 5, 14, 13, 2, 1, 12, 13, 6, 18, 11, 6, 1, 5, 8,
                14, 19, 9, 20, 2, 7, 1, 1, 2, 15, 8, 7, 20, 3, 8, 4, 2, 10, 4, 8,
                10, 14, 3, 17, 2, 3, 11, 18, 14, 18, 16, 12, 14, 11, 12, 18, 17, 9,
                14, 1, 10, 13, 14, 4, 20, 17, 18, 14, 8, 2, 17, 16, 15, 10, 16, 19,
                6, 10, 17, 14, 19, 18, 2, 12, 14};

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        Exercicio2 exercicio2 = new Exercicio2();
        exercicio2.buscaComMultiplasOcorrencias(vetor, valor);

        sc.close();
    }
}
