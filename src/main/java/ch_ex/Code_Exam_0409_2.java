package ch_ex;

import java.util.Scanner;

public class Code_Exam_0409_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;

        a = s.nextInt();

        if (a%15 == 0) {
            System.out.println("3과 5의 배수를 모두 만족합니다.");
        }else if (a%3 == 0) {
            System.out.println("3의 배수입니다.");
        }else if (a%5 == 0) {
            System.out.println("5의 배수입니다.");
        }else {
            System.out.println("해당 없습니다.");
        }

        s.close();
    }
}
