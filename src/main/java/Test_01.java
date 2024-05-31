public class Test_01 {
    public static void main(String[] args) {

        for(int k = 0; k < 72; k++){ //k는 0부터 71까지 반복 합니다. 0부터 시작해서 71까지 반복해서 총 72번 반복
            int i = k / 9 + 2; // 0부터 71까지의 값을 9로 나누고 2를 더하여 구구단의 단수를 나타내는 값 ex) k가 0이면 i = 2 , k가 8일때 i = 2 , k가 9이면 i = 3 , k가 17이면 i = 4 해서 10까지 증감
            int j = k % 9 + 1; // 0부터 71까지의 값을 9로 나눈 나머지에 1을 더하여 각 단에서의 곱해지는 수를 계산 ex)  k가 0일 때 j = 1 , k가 8일 때 j = 9 해서 j는 1부터 9까지 변함
            System.out.println(i + "x" + j + "=" + i * j); // i * j 구구단 출력

        }
    }
}
