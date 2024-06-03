package ch9;


import java.util.Scanner;

public class Code09_03_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[4];

        //for문을 활용해서 ary값에 1 ~ 3까지 값을 저장
        for(int i =0; i < 4; i++){
            numAry[i] = s.nextInt();
        }
        //for문으로 배열 각각의 값을 출력
        for(int i = 0; i < numAry.length; i++){
            System.out.println(numAry[i] + "\t");
        }
    }
}
