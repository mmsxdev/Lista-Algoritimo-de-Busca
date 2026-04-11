package org.example.Exercicios.Exercicio6;

import java.util.Arrays;

public class Exercicio6 {

    public void executarBuscas(int[] vetor, int valorBuscado) {
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
