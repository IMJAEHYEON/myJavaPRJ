package Bakejoon;

import java.util.Scanner;

public class Back_1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] inp = s.next().toUpperCase().split("");
        int[] count = new int[inp.length];
        int max = 0;
        int tmp = 0;
        String result = "";

        for (int k = 0; k < inp.length; k++) {
            for (int j = 0; j < inp.length; j++) {
                if (inp[k].equals(inp[j])) {
                    count[j]++;
                    break;
                }
            }
        }

        for (int l : count) {
            max = Math.max(max, l);
        }

        for (int m = 0; m < count.length; m++) {
            if (count[m] == max) {
                result = inp[m];
                tmp++;
            } else if (tmp >= 2) {
                result = "?";
                break;
            }
        }

        System.out.print(result);
        s.close();
    }
}