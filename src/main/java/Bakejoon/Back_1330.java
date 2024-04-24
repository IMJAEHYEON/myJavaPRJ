package Bakejoon;

import java.util.Scanner;

public class Back_1330 {
    public static void main(String[] args) { // 크기 비교

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if(a > b){
            System.out.println(">");

        } else if(a == b){
            System.out.println("==");

        } else{
            System.out.println("<");
        }
    }
}
