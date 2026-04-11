package org.example.Exercicios.Exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    private Aluno[] alunos = new Aluno[100];
    private int total = 0;

    public void inserirAluno(Scanner sc) {
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        int mat = sc.nextInt();

        alunos[total++] = new Aluno(nome, mat);
    }

    public void ordenar() {
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

    public void buscar(Scanner sc) {
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
