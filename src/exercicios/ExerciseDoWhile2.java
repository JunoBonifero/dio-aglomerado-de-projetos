package exercicios;

import java.util.Scanner;

public class ExerciseDoWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros serao inseridos? ");
        int contagem = sc.nextInt();
        int pares = 0;
        int impares = 0;

        do {
            System.out.print("Insira um numero: ");
            int numeroInserido = sc.nextInt();
            if (numeroInserido % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contagem--;
        } while (contagem > 0);

        System.out.println("Pares: " + pares + ", Impares: " + impares);
    }
}
