package ch_lab;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int age;

        System.out.print("나이 입력 ==>");
        age = s.nextInt();

        if (age >= 18) {
            System.out.println("즐거운 시간 보내세요. ^^7");
        }else {
            System.out.println("미성년자는 집에 갈 시간입니다. ^^7");
        }
        System.out.println("협조해주셔서 감사합니다");

        s.close();
    }
}
