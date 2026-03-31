package org.example.Exercicios.Exercicio5;

import java.util.Scanner;
import java.util.ArrayList;

public class Main5 {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     ArrayList<Integer> vetor = new ArrayList<>();
    boolean continuar = true;
     while(continuar){
         System.out.print("Digite o numero a ser adicionado: ");
         int x = Integer.parseInt(sc.nextLine());
         vetor.add(x);

         System.out.print("Deseja continuar? [S/N]: ");
         String esc = sc.nextLine();
         if (esc.equalsIgnoreCase("N")){
             continuar = false;
         }
     }

     System.out.print("Número: ");
     int y = Integer.parseInt(sc.nextLine());
     ArrayList<Integer> vetorOrg = Exercicio5.ordenarVetor(vetor);
     Exercicio5.buscaBinariaVetor(vetor,y);

 }
}
