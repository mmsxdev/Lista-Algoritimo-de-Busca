package org.example.Exercicios.Exercicio7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        String[] nomes = {"Paulo","Luiz","Miguel","Vinicius","Djan","Geovana","Georgia","George","Matheus","Afonso"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome a ser procurado: ");
        String nomeProc = sc.nextLine();
        int index = Exercicio7.buscarString(nomes,nomeProc);

        if(index == -1){
            System.out.println("O nome "+nomeProc+" não foi encontrado!");
        }else{
            System.out.println("O nome "+nomeProc+" foi encontrado na posição: "+index);
        }
    }
}
