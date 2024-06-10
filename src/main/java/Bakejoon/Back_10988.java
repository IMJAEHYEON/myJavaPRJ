package Bakejoon;


import java.util.Scanner;
public class Back_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pel = sc.next();

        if(pel.equals("level") || pel.equals("noon")) {
                System.out.print(1);
        } else if (pel.equals("baekjoon") || pel.equals("online") || pel.equals("judge")) {
                System.out.print(0);

        }
    }
}
