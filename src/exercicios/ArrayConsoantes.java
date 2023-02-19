package exercicios;

import java.util.Scanner;

/* Faça um Programa que leia um vetor de 6 caracteres, e
diga quantas consoantes foram lidas. Imprima as consoantes.
 */

public class ArrayConsoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[6];
        int vogal = 0;

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Insira uma letra: ");
            letras[i] = sc.next().charAt(0);
        }
        for (char j : letras) {
            switch (j) {
            case 'a', 'e', 'i', 'o', 'u' -> vogal++;
            default -> System.out.print(j + " ");
            }
        }
        System.out.println("- " + (6-vogal) + " Consoantes.");
    }
}
