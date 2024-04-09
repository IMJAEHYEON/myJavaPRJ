package ch5;

public class Code05_01_2 {
    public static void main(String[]args){

        int num = 99;

        if(num > 100)
            System.out.println("100보다 작습니다");
            System.out.println("난 무조건 실행된다"); 
            // if문은 if문 밑에 한줄만을 인식하고 출력한다, 여러줄을 출력하려면 }{ 으로 포함시켜야한다

        if(num < 100)
            System.out.println("100보다 작습니다");

        System.out.println("난 무조건 실행된다");
    }
}
