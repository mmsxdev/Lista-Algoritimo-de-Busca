package org.example.Exercicios.Exercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercicio5 {
    public static ArrayList<Integer> ordenarVetor(ArrayList<Integer> vetor){
        Collections.sort(vetor);
        return vetor;
    }

    public static void buscaBinariaVetor(ArrayList<Integer> vetor, int x){
        int ini = 0, fim = vetor.size() - 1;
        boolean encontrado = false;

        int m = -1;
        while (ini <= fim &&  !encontrado) {
            m = (ini + fim) / 2;

            if (vetor.get(m) == x) {
                 encontrado = true;
                break;
            }else if(vetor.get(m) < x){
                ini = m + 1;
            }
            else{
                fim = m - 1;
            }
        }
        if  (encontrado) {
            System.out.println("Numero "+x+" encontrado na posição "+m);
        }
        else{
            System.out.println("-1\nNumero "+x+ " não encontrado");
        }
    }
}
