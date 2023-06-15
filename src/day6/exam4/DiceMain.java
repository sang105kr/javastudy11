package day6.exam4;

public class DiceMain {
  public static void main(String[] args) {
    Dice dice = new Dice();
    int num = dice.roll();  // 주사위 굴리기
    System.out.println(num);

    num = dice.roll();  // 주사위 굴리기
    System.out.println(num);

    num = dice.roll();  // 주사위 굴리기
    System.out.println(num);
  }
}
