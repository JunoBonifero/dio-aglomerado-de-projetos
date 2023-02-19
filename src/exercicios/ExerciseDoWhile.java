package exercicios;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o
maior número e a média desses números.
*/
public class ExerciseDoWhile {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int media;
        int somaTotal = 0;
        int maiorNumero = 0;
        int i = 0;

        do {
            numeros[i]= sc.nextInt();
            somaTotal += numeros[i];
            if (maiorNumero < numeros[i]) {
                maiorNumero = numeros[i];
            }
            i++;
        } while (i < 5);

        media = somaTotal / numeros.length;

        System.out.println("Media = " + media + ", Maior Numero = " + maiorNumero);
    }

}
