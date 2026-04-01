package org.example.Exercicios.Exercicio1;

public class Exercicio1 {

    public int buscaSequencial(int[] v, int num) {

        for (int i = 0; i < v.length; i++) {
            if (v[i] == num) {
                return i;
            }
        }

        return -1;
    }
}