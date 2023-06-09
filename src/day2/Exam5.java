package day2;
/*
  3개의 정수값을 임의 지정해서 가장큰 수를 구하시오.
  if문만 사용할것.
 */
public class Exam5 {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = 30;
    int a = 40;

    int max = x;
    if(max < y) {
      max = y;
    }
    if(max < z) {
      max = z;
    }
    if(max < a) {
      max = a;
    }
    System.out.println("최대값="+max);
  }
}
