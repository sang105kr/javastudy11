package day2;

public class Exam2 {
  public static void main(String[] args) {
    int x;   // 변수 선언
    x = 10;  // 초기화 : 변수 선언후 최초에 값을 할당하는 행위
    x = 20;  // 재할당
    System.out.println("x=" + x);

    int y = 30;   // 변수선언 + 초기화
    System.out.println("y=" + y);

    int a, b ,c;   // 여러개의 변수를 한줄에 선언
//    a=1;
//    b=2;
//    c=3;
    a = b = c = 40;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
