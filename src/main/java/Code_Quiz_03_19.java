public class Code_Quiz_03_19 {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for (int h = 1; h<= i * 2 - 1; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}