package ch4;

public class Code04_13_2 {
    public static void main(String[] args) {
        String str = "한글   ABCD   efgh";
        String cutStr;

        cutStr = str.replaceAll(" ","");

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("모든공백 제거 ==> ["+ cutStr +"]");

    }
}
