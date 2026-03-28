package org.example.Exercicios.Exercicio4;

public class Exercicio4 {
    public boolean VetorOrdenado(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false; // já achou erro
            }
        }
        return true;
    }

    public int BuscaBinaria(int[] vetor, int valor){
            int inicio = 0;
            int fim = vetor.length -1;

            while (inicio <= fim){
                int meio = (inicio + fim) / 2;
                if (vetor[meio] == valor){
                    return meio;
                }
                if (vetor[meio] < valor){
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
            return -1;
    }
}
