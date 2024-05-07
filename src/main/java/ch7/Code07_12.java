package ch7;
class Rabbit7{
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
}
public class Code07_12 {
    public static void main(String[] args) {

        Rabbit7 rabbit = new Rabbit7();

        // 에러 r.xPos = 100;
        rabbit.setPosition(100,200);
    }
}
