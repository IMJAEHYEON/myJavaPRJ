import java.util.Scanner;

public class Exam01_04_01 {

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = a * b;

        System.out.println(a + "*" + b + "=" + c);

    }
}
