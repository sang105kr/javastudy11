package day15.quiz1;

import java.util.Random;

public class Coin {
  private final int HEADS = 1;  //앞면
  private final int TAIL = 2;   //뒷면
  private int face;             // 현재면

  public Coin() {
    super();
    face = 1;   //동전의 초기 상태를 앞면
  }

  public void flip() {
//    face = (int)(Math.random()*2)+1;
    Random random = new Random();
    face = random.nextInt(2) + 1;
  }

  //동전의 현재 면을 정수로 반환
  public int getFace() {
    return face;
  }

  @Override
  public String toString() {
    return (face == HEADS) ? "앞면" : "뒷면";
  }
}
