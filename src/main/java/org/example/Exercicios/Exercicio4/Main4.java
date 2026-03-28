package org.example.Exercicios.Exercicio4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Exercicio4 exercicio4 = new Exercicio4();
        if (!exercicio4.VetorOrdenado(vetor)) {
            System.out.println("Vetor não ordenado! Não é possível aplicar busca binária.");
        } else {

            System.out.print("Digite o valor para busca binária: ");
            int valor = sc.nextInt();

            int resultado = exercicio4.BuscaBinaria(vetor, valor);

            if (resultado != -1) {
                System.out.println("Valor encontrado na posição: " + resultado);
            } else {
                System.out.println("Valor não encontrado.");
            }
        }

        sc.close();
    }
}
