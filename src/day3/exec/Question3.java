package day3.exec;

public class Question3 {
  public static void main(String[] args) {
    for (int i = 0; ; i++) {
      if (i == 11) break;
      if (i % 2 == 1) continue;
      System.out.println(i);
    }
  }
}
