package ch7;

class Rabbit5 {
    String shape; // 토끼의 모양
    int xPos; // X 위치
    int yPos; // Y 위치

     Rabbit5() {
        shape = "토끼";
    }

    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + this.xPos + " / yPos : " + this.yPos);
    }
}
public class Code07_10 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();

        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.",rabbit.shape);
    }
}