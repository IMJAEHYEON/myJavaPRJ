package ch7;

class Rabbit { // 실제 코드에서는 권장하지않는 형식
    String shape; // 토끼의 모양
    int xPos; // X 위치
    int yPos; // Y 위치

    void setPosition(int x, int y){
        xPos = x;
        yPos = y;

        System.out.println("xPos : " + xPos + " / yPos : " + yPos);
    }
}

public class Code07_06 {
    public static void main(String[] args) {
        Rabbit rb1 = new Rabbit();
        rb1.setPosition(100,100);

        Rabbit rb2 = new Rabbit();
        rb2.setPosition(200,200);
    }
}
