package exercicios;

import java.util.Scanner;

public class ExerciseWhile2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        while (0 > nota || nota > 10) {
            nota = sc.nextInt();
        }

    }

}
