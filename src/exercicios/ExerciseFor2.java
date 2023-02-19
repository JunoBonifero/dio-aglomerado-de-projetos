package exercicios;

import java.util.Scanner;

public class ExerciseFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deseja saber o fatorial de qual numero? ");
        int fatorialDe = sc.nextInt();
        int resultado = fatorialDe;

        System.out.print(fatorialDe+"!="+fatorialDe);

        for (int i = fatorialDe - 1; i > 0; i--) {
            resultado *= i;
            System.out.print("." + i);
        }

        System.out.println("=" + resultado);
    }
}
