package ch6;

import java.util.Scanner;

public class Code06_Q3 {
    // Q3 Q2를 만족한상태로 첫번째가 200, 100이라면 첫번째수부터 두번째 수 사이에 3의배수인 수를 구해라
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {

            for(int i = a; i > b; i--) {
               if(i % 3 == 0) {
                   System.out.println(i);
               }
            }
        } else {
            for(int i = a; i < b; i++) {

                if(i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}