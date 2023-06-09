package day2;

public class Exam9 {
  public static void main(String[] args) {
    int x = 10;
    x = x + 1;  // x++(증감후위) , ++x(증감전위)
    System.out.println("x="+x);
    // 단독으로 사용될때
    x++;    // x=x+1
    System.out.println("x="+x);
    ++x;    // x=x+1
    System.out.println("x="+x);
    x--;   // x = x - 1
    System.out.println("x="+x);
    --x;   // x = x - 1
    System.out.println("x="+x);

    // 증감연산자가 식에 참여할때 주의
    // 전위: 자기자신을 1증감하고난뒤 식에 참여
    // 후위: 식에 참여후 자신을 1증감
    int z = 1 + ++x;
    System.out.println("x="+x);
    System.out.println("z="+z);
  }
}
