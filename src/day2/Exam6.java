package day2;
/*
  3개의 정수값을 임의 지정해서 가장큰 수를 구하시오.
  if문만 사용할것.
 */
public class Exam6 {
  public static void main(String[] args) {
    int x = (int)(Math.random() * 100) + 1;  // 1~100 사이의 임의 정수 발생
    int y = (int)(Math.random() * 100) + 1;
    int z = (int)(Math.random() * 100) + 1;

    System.out.println("x="+x);
    System.out.println("y="+y);
    System.out.println("z="+z);

    int max = x;
    if(max < y) {
      max = y;
    }
    if(max < z) {
      max = z;
    }
    System.out.println("최대값="+max);
  }
}
