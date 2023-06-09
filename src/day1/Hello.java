package day1;
/*
  여러줄 주석
*/
// 클래스 정의
public class Hello {
  public static void sum(int n, int m) {
    System.out.println("sum() 호출됨");
  }

  public static int sum2(int n, int m) {
    System.out.println("sum2() 호출됨");
    return n + m;
  }

  // 실행 메소드 정의
  public static void main(String[] args) {
    System.out.println("Hello World");
    sum(10,20);
    int result = sum2(30,40);
    System.out.println("result=" + result);
  }
}
