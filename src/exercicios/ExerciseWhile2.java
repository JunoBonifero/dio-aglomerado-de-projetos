package exercicios;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido.
*/
public class ExerciseWhile2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        while (0 > nota || nota > 10) {
            nota = sc.nextInt();
        }

    }

}
