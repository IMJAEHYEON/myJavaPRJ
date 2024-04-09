package ch6;

import java.util.Scanner;

public class Code06_Q2 {
    // Q2 첫번째가 200, 100이라면, 첫번째 수가 크다면 ,,, 200 ,, 199 , 198,,,100
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();


        for (int i = a; i < b; i++) {
            System.out.println(i+ " ");
        }
        if ( a > b ){
            for (int i =a; i > b; i--){
                System.out.println(i + " ");
            }

        }
    }
}