package Bakejoon;

import java.util.Scanner;

public class Back_2753 {
    public static void main(String[] args) { // 윤년
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();

        if((year%4 == 0 && year%100 !=0) || year%400 == 0){
            System.out.println("윤년 입니다");
        }else{
            System.out.println("윤년이 아닙니다");
        }
    }
}
