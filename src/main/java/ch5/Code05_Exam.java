package ch5;

import java.util.Scanner;

public class Code05_Exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a ;
        a = s.nextInt();

        if (a < 100) {
            System.out.print("100보다");
            System.out.print("작습니다");
        }
    }
}