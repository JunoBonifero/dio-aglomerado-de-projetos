package exercicios;

import java.util.Scanner;

/* Faça um Programa que leia um vetor de 5 números inteiros
e mostre-os na ordem inversa.
 */

public class ArrayOrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosLidos = new int[5];

        for (int i = 0; i < numerosLidos.length; i++) {
            System.out.print("Insira um numero no Array: ");
            numerosLidos[i] = sc.nextInt();
        }
        System.out.print("Array Inverso: ");
        for (int i = numerosLidos.length; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
