package org.example.Exercicios.Exercicio6;

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

        Exercicio6 exercicio = new Exercicio6();
        exercicio.executarBuscas(vetor, valorBuscado);
    }
}
