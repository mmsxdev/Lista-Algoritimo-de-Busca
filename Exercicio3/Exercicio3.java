package org.example.Exercicios.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner busca = new Scanner(System.in);

        int[] v = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int ini = 0, fim = v.length - 1;

        System.out.print("Número: ");
        int x = busca.nextInt();

        while (ini <= fim) {
            int m = (ini + fim) / 2;

            if (v[m] == x) {
                System.out.println("Posição: " + m);
                return;
            }

            if (v[m] < x) ini = m + 1;
            else fim = m - 1;
        }

        System.out.println("-1");
    }
}