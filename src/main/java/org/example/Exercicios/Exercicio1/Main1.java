
package org.example.Exercicios.Exercicio1;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] v = new int[80];

        for (int i = 0; i < 80; i++) {
            v[i] = i + 1;
        }

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        Exercicio1 ex = new Exercicio1();
        int resultado = ex.buscaSequencial(v, num);

        if (resultado != -1) {
            System.out.println("Encontrado na posição: " + resultado);
        } else {
            System.out.println("Não encontrado");
        }

        scanner.close();
    }
}