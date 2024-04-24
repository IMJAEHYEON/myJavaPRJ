package Bakejoon;

import java.util.Scanner;

public class Back_9498 {
    public static void main(String[] args) { // 시험성적 입 , 출력
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if(a >= 90){
            System.out.println("A");
        }else if(a >= 80){
            System.out.println("B");
        }else if(a >= 70){
            System.out.println("C");
        }else if(a >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
