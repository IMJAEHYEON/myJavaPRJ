package Bakejoon;

import java.util.Scanner;

public class Back_8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int hap =0;

        if(a <0 || a >=10000) return;
            for(int i = 0; i < a; i++){
                hap = hap + a - i;
        }
        System.out.println(hap);
        }


        }