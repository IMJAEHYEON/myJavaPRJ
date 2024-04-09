package ch4;

public class Code04_09 {
    public static void main(String[] args){
        System.out.println("\n줄바꿈\n연습"); // \n 다음 행으로 이동 (엔터키 사용과 같은효과)
        System.out.println("\t탭키\t연습");  // \t 다음 탭으로 이동 (탭 과 같은효과)
        System.out.println("어떤 글자를 \"강조\"하는 효과1");  // \" "을 출력
        System.out.println("어떤 글자를 '강조'하는 효과2");  // \' ' 출력 " ' " 큰따옴표 안에서는 역슬래쉬 사용안해도됨
        System.out.println("\\\\ 백슬래쉬 2개 출력");  // \\ \을 출력
    }
}

// \b 뒤로 한칸 이동 (백스페이스와 같은 효과) 이클립스에서는 깨진글자가 보일수있다.