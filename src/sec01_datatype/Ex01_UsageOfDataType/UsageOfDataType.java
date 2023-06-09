package sec01_datatype.Ex01_UsageOfDataType;

public class UsageOfDataType {
  public static void main(String[] args) {
    // 변수 선언과 함께 값 대입
    int a = 3;
    // 변수 선언과 값 대입 분리
    int b;
    b = 4;
    System.out.println(a);
    System.out.println(b);

    System.out.println(2 + 3);
    System.out.println(a + b); //덧셈
    System.out.println(a - b); //뺄셈
    System.out.println(a * b); //곱셈
    System.out.println(a / (double)b); //나눗셈
    System.out.println(a % b); //나머지
  }
}
