package ch7;

class Rabbit4 { // 실제 코드에서는 권장하지않는 형식
    String shape; // 토끼의 모양
    int xPos; // X 위치
    int yPos; // Y 위치

    void setPosition(int x, int y){
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + this.xPos + " / yPos : " + this.yPos);
    }
}
public class Code07_09 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100,100);
        rabbit2.setPosition(-100,100);
        rabbit3.setPosition(0,-100);
    }
}
