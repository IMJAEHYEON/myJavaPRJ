import java.util.Scanner; //:Scanner 클래스 불러오기

    public class test2 { //:클래스 이름
        public static void main(String[] args) { //:메인 메소드 실행
            Scanner s = new Scanner(System.in); //: Scanner 객체 설정
            int a, b;  //:변수 설정

            System.out.println("첫 번째 정수(a) ==> ");  //:"첫 번째 정수(a) ==>" 출력
            a = s.nextInt();  //:a 정수값 입력

            System.out.println("두 번쨰 정수(b) ==> ");  //:"두 번쨰 정수(b) ==> " 출력
            b = s.nextInt();  //:b 정수값 입력

            int hap = 0;  //:변수 설정,a부터 b까지 합계를 누적할 변수 hap 준비
            for (int i = a+1; i <= b; i += 2) { //:변수 i가 a을 시작으로 b까지 2씩 증가
                hap += i; //:합에 i를 더해서 대입
            }
            System.out.println("a부터 b까지 홀수의 합계 : "+hap);  //:"a부터 b까지 홀수의 합계 : " 출력
            s.close(); //:Scanner 클래스 닫기
        }
    }
