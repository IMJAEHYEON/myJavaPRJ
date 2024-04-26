package Bakejoon;

import java.util.Scanner;

public class Back_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hour = s.nextInt();
        int min = s.nextInt();


        if(min < 45){
            hour--;
            min =60 - (45 - min);
            if(hour < 0){
                hour = 23;
            }
            System.out.println(hour + " " + min);
        }
        else {
            System.out.println(hour + " " + (min -45));
        }
    }
}
