package ch_lab;

import java.util.Scanner;

public class Code_Lab02_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number1, number2;
        int resAdd;
        int resSub;
        int resMul;
        double resDiv; // 나누기 결과
        int resRem; // 나머지 값 결과

        System.out.print("정수1 ==>");
        number1 = s.nextInt();
        System.out.print("정수2 ==>");
        number2 = s.nextInt();

        resAdd = number1 + number2;
        resSub = number1 - number2;
        resMul = number1 * number2;
        resDiv =(double) number1 / number2;
        resRem = number1 % number2;

        System.out.println(number1 + "+" + number2 + "=" + resAdd);
        System.out.println(number1 + "-" + number2 + "=" + resSub);
        System.out.println(number1 + "x" + number2 + "=" + resMul);
        System.out.println(number1 + "/" + number2 + "=" + resDiv);
        System.out.println(number1 + "%" + number2 + "=" + resRem);

        s.close();

    }
}