package day3;

public class Exam4 {
  public static void main(String[] args) {
    int a;
    outer :    // label
    for (int i = 0; i < 5; i++) {
      int j = 0;
      for (   ; j < 5; j++) {
        System.out.println("j=" + j);
        if( j == 3) break outer;
      }
      System.out.println("i=" + i);
      System.out.println("j=" + j);
    }
  }
}
