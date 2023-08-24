package br.com.danielverdi;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        double notasAluno = 0;
        for (int i = 1; i <=4; i++){
            System.out.println("Digite a sua nota " + i + ":");
            double nota = s.nextDouble();
            notasAluno += nota; //Uso da operação de atribuição "+=".
        }       if (notasAluno/4 >= 7){
                    System.out.println("Parabéns, você foi aprovado");
        }           else if (notasAluno/4 >=5) {
                    System.out.println("Putz, você está de recuperação");
        }           else if (notasAluno/4 <5){
                    System.out.println("Você está reprovado");
        }           else {

        }
    }
}