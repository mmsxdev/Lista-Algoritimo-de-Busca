package org.example.Exercicios.Exercicio6;

import java.util.Arrays;
import java.util.Random;

public class Main6 {

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random random = new Random();

        // Gerar vetor com números aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10000);
        }

        int valorBuscado = vetor[500]; // pega um valor que sabemos que existe

        // Busca Sequencial
        int comparacoesSeq = 0;
        int posSeq = -1;

        for (int i = 0; i < vetor.length; i++) {
            comparacoesSeq++;
            if (vetor[i] == valorBuscado) {
                posSeq = i;
                break;
            }
        }

        // Ordenar vetor para busca binária
        Arrays.sort(vetor);

        // Busca Binária
        int comparacoesBin = 0;
        int inicio = 0;
        int fim = vetor.length - 1;
        int posBin = -1;

        while (inicio <= fim) {
            comparacoesBin++;
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valorBuscado) {
                posBin = meio;
                break;
            } else if (vetor[meio] < valorBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        // Resultados
        System.out.println("RESULTADOS:");
        System.out.println("Busca Sequencial -> Comparações: " + comparacoesSeq + " | Posição: " + posSeq);
        System.out.println("Busca Binária   -> Comparações: " + comparacoesBin + " | Posição: " + posBin);
    }
}
