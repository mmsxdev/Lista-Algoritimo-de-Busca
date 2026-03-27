package org.example.Exercicios.Exercicio7;

public class Exercicio7 {
    public static int buscarString(String[] vetor, String nome){
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i].equalsIgnoreCase(nome)){
                return i;
            }
        }
        return -1;
    }
}
