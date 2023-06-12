package day3;
/*
  1~10 까지의 짝수 합을 구하시오.
  for, while, do~while
 */
public class Exam2 {
  public static void sumWithFor() {
    int sum = 0; // 지역변수 : 메소드 내에 선언된 변수, 메소드 내에 동일한 이름의 변수를 둘 수 없다.
    for (int i = 1; i <= 10; i++) {
      if( i % 2 == 0) {
        sum += i;   // sum = sum + i;
      }
    }
    System.out.println("sum=" + sum);
  }

  public static void sumWithWhile() {
    int sum = 0;
    int i = 1;
    while (i <= 10) {
      if( i % 2 == 0 ) {
        sum += i; // sum = sum + i;
      }
      i++; // i = i + 1
    }
    System.out.println("sum=" + sum);
  }

  public static void sumWithDoWhile() {
    int sum = 0;
    int i = 2;
    do {
      sum += i;
      i = i + 2;
    } while (i <= 10);
    System.out.println("sum=" + sum);
  }

  public static void main(String[] args) {
    sumWithFor();
    sumWithWhile();
    sumWithDoWhile();
  }
}
