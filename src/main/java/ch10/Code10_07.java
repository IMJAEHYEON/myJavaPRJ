package ch10;

public class Code10_07 {   // 주석 처리 한 코드는 직접 코딩한 것
//  static int hap_para(int v1, int v2) {
//        int result;
//        result = v1 + v2;
//        return result;
//    }
//    static int hap_para(int v1,int v2,int v3){
//        int result;
//        result = v1 + v2 + v3;
//        return result;
//    }
    public static int hap_para(int v1,int v2){
        int result = v1 + v2;
        return result;
    }
    public static int hap_para(int v1,int v2,int v3){
        return hap_para(v1,v2) + v3;
    }
    public static void main(String[] args) {
        int hap;
        hap = hap_para(10,20);
        System.out.println("매개변수 2개 메서드 호출 결과 ==> " + hap);

        hap = hap_para(10,20,30);
        System.out.println("매개변수 3개 메서드 호출 결과 ==> " + hap);
    }
}

