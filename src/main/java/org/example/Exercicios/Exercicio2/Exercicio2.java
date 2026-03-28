package org.example.Exercicios.Exercicio2;

//Exercício 2 – Busca Sequencial com Múltiplas Ocorrências

// Implemente um programa em Java que:
//  Crie um vetor de inteiros com 80 posições que possua repetidos
// (valores fixos)
//  Solicite ao usuário um número
//  Exibir todas as posições onde o valor aparece
// Exemplo:
// Vetor: [10, 20, 30, 20, 50]
// Busca: 20
// : posições 1 e 3

public class Exercicio2 {
    public void buscaComMultiplasOcorrencias (int[] vetor, int valor){
       boolean valorEncontrado = false;

        //Listando vetor
        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.print("]");

        //Realizando a busca
        System.out.println("\nBusca: " + valor);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor){
                System.out.println("Posição: " + i);
                valorEncontrado = true;
            }
        } if (valorEncontrado != true){
            System.out.println("Valor não encontrado");
        }
    }
}
