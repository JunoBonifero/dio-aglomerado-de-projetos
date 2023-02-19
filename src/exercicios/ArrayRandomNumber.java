package exercicios;

import java.util.Arrays;
import java.util.Random;

/*Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final, mostre os números e seus sucessores.
 */

public class ArrayRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(101);
        }
        Arrays.sort(numerosAleatorios);
        for (int i : numerosAleatorios) {
            System.out.println("Numero sorteado: " + i + " Seu sucessor: " + (i+1));
        }

    }
}
