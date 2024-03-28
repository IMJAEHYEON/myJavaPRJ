public class Store_lab {
    //삼각김밥 (900원) 10개 구입
    //바나나맛 우유 (1800원) 2개 판매
    //도시락 (3500원) 5개 구입
    //도시락 (4000원) 4개 판매
    //콜라 (1500원) 1개 판매
    //새우깡 (2000원) 4개 판매
    //캔커피 (1800원) 5개 판매

    public static void main(String[]args){
        int total = 0;

        total -= 900*10;
        total += 1800*2;
        total -= 3500*5;
        total += 4000*4;
        total += 1500;
        total += 2000*4;
        total += 1800*5;

        System.out.println("오늘 총매출액은 " + total + "원입니다.");
    }
}
