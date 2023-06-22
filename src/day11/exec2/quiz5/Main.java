package day11.exec2.quiz5;

public class Main {
  public static void main(String[] args) {
    // 주사위 생성
    Die d1 = new Die();
    Die d2 = new Die();
    Die[] dies = new Die[2];
    dies[0] = d1;
    dies[1] = d2;

    // 사람 생성
    Person p1 = new Person();
    // 사람->주사위
    p1.setDie(dies);

    // 사람이 주사위 굴리기
    p1.rollDies();
    dies = p1.getDies();
    for (int i = 0; i < dies.length; i++) {
      System.out.print(dies[i].getFaceValue()+",");
    }
    System.out.println();

    p1.rollDies();
    dies = p1.getDies();
    for (int i = 0; i < dies.length; i++) {
      System.out.print(dies[i].getFaceValue()+",");
    }
    System.out.println();

  }
}
