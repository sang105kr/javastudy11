package day15.exam1;

public class TryCatch3 {
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      System.out.println(i);

      try {
        Thread.sleep(1000);
      } catch (Exception e) {

      }

    }
  }
}
