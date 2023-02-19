package exercicios;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
número inteiro entre 1 a 10. O usuário deve informar de qual numero ele
deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 */

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
