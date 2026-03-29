package org.example.Exercicios.Exercicio8;

import java.util.Scanner;

public class Main8 {

    static Aluno[] alunos = new Aluno[100];
    static int total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Inserir aluno");
            System.out.println("2 - Ordenar por matrícula");
            System.out.println("3 - Buscar por matrícula");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    inserirAluno(sc);
                    break;
                case 2:
                    ordenar();
                    break;
                case 3:
                    buscar(sc);
                    break;
            }

        } while (opcao != 0);
    }

    static void inserirAluno(Scanner sc) {
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        int mat = sc.nextInt();

        alunos[total++] = new Aluno(nome, mat);
    }

    static void ordenar() {
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - i - 1; j++) {
                if (alunos[j].matricula > alunos[j + 1].matricula) {
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[j + 1];
                    alunos[j + 1] = temp;
                }
            }
        }
        System.out.println("Ordenado!");
    }

    static void buscar(Scanner sc) {
        System.out.print("Digite a matrícula: ");
        int mat = sc.nextInt();

        int inicio = 0;
        int fim = total - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (alunos[meio].matricula == mat) {
                System.out.println("Aluno encontrado: " + alunos[meio].nome);
                return;
            } else if (alunos[meio].matricula < mat) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Aluno não encontrado!");
    }
}
