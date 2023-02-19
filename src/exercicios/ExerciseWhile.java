package exercicios;

import java.util.Objects;
import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores, o primeiro representando
o nome do aluno e o segundo representando a sua idade. (Pare o programa
inserindo o valor 0 no campo nome)*/
public class ExerciseWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName = "no information";
        int studentAge;
        while (!Objects.equals(studentName, String.valueOf(0))) {
            studentName = sc.next();
            studentAge = sc.nextInt();
        }
    }
}