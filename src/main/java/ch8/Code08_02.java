package ch8;

class Rabbit1{
    String shape;
    int xPos;
    int yPos;

    void move(int x,int y){
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + xPos + " / yPos : " + yPos);
    }
}
class HouseRabbit1 extends Rabbit1{

    String owner;
    void eatFeed(){
        System.out.println("집토끼가 사료를 먹습니다.");
    }

    @Override
    void move(int x, int y) {
        System.out.println("나는 덮어쓰기한 이동 함수입니다.");
    }
}
class MountainRabbit1 extends Rabbit1{
    String mountain;
    void eatWildGlass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_02 {
    public static void main(String[] args) {

    }
}
