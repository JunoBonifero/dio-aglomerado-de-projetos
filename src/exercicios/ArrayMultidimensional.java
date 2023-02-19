package exercicios;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int menor = 9;
        String posicao = "";
        int[][] matrizAleatoria = new int[4][4];

        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                matrizAleatoria[i][j] = random.nextInt(10);
                if (matrizAleatoria[i][j] < menor) {
                    menor = matrizAleatoria[i][j];
                    posicao = " Posicao da matriz: [" + i + ", " + j +"]";
                }
            }
        }
        System.out.println("Menor numero: " + menor + posicao);
    }
}
