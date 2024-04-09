package ch6;

import java.util.Scanner;

public class Code06_Q1 {
    // 숫자 입력 받아서 첫번째 시작값, 두번째가 끝나는 값까지 반복

    // Q2 첫번째가 200, 100이라면, 첫번째 수가 크다면 ,,, 200 ,, 199 , 198,,,100

    // Q3 Q2를 만족한상태로 첫번째가 200, 100이라면 첫번째수부터 두번째 수 사이에 3의배수인 수를 구해라
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        for (; a < b ; a++) {
            System.out.println(a + " ");
        }
    }
}
