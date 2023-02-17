package exercicios;

import java.util.Objects;
import java.util.Scanner;

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