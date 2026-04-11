package org.example.Exercicios.Exercicio8;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicio8 exercicio = new Exercicio8();
        int opcao;

        do {
            System.out.println("\n1 - Inserir aluno");
            System.out.println("2 - Ordenar por matrícula");
            System.out.println("3 - Buscar por matrícula");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    exercicio.inserirAluno(sc);
                    break;
                case 2:
                    exercicio.ordenar();
                    break;
                case 3:
                    exercicio.buscar(sc);
                    break;
            }

        } while (opcao != 0);
    }
}
