package ch_ex;

import java.util.Scanner;

public class Code_24_04_01_exam {

    //Scanner로 입력받는 값이
    //3의 배수인지?
    //5의 배수인지?
    //3의 배수와 5의 배수를 모두 만족하는지
    //출력하는 프로그래밍
    // 출력 예 : 3의 배수입니다. , 5의 배수입니다 , 3의 배수 5의 배수 모두 만족합니다.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("숫자 입력 ==> ");
        a = s.nextInt();

        if (a % 15 == 0) {
            System.out.print("3의 배수,5의 배수 모두 만족합니다.");
        } else if (a % 5 == 0) {
            System.out.print("5의 배수입니다");
        } else if (a % 3 == 0) {
            System.out.print("3의 배수입니다");
        } else {
            System.out.println("배수가 아닙니다");
        }
    }
}