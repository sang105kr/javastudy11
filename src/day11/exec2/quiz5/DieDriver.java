package day11.exec2.quiz5;

public class DieDriver {

  public static void main(String[] args) {
    Die	d1 = null, d2 = null;
    int sum = 0;
    int count = 0;

    d1 = new Die();
    d2 = new Die();

    for (int i = 0; i < 100; i++) {
      d1.roll();
      d2.roll();

      sum = d1.getFaceValue() + d2.getFaceValue();
      if (sum == 7 || sum == 11) {
        count++;
      }
    }

    System.out.println("주사위 눈의합이 7 or 11 이 나온 횟수 : " + count);

  }
}
