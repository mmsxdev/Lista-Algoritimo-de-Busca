
package org.example.Exercicios.Exercicio3;

public class Exercicio3 {

    public int buscaBinaria(int[] v, int num) {

        int inicio = 0;
        int fim = v.length - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (v[meio] == num) {
                return meio;
            }

            if (v[meio] < num) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}