package exercicios;

import java.util.Scanner;

public class ExerciseFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deseja ver a tabuada de qual numero? ");
        int tabuadaDo = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int resultado = tabuadaDo*i;
            System.out.println(tabuadaDo + " X " + i + " = " + resultado);
        }
    }
}
