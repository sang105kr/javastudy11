package day11.exec2.quiz12;

import java.util.Scanner;

public class PigPlayer {
  private int total;                  //게임에서 얻은 총 점수
  private int round;                  //현 회차에서 얻은 점수
  private int limit;                  //한 회차에서 얻을 수 있는 최대 점수
  public static final int ASK = -1; //회차 종료를 위한 메시지

//  생성자 메소드: 점수들을 0으로 초기화하고 최대 획득 점수를 주어진 값으로 한다
  public PigPlayer(int limit){
    this.limit = limit;
  }

//  roll: 주사위 쌍을 던지고 결과를 다룬다
  public boolean roll(PairOfDice dice, int goal){
    boolean stop = false;
    Scanner scanner = new Scanner(System.in);
    dice.roll();
    int dice1 = dice.getDie1();
    int dice2 = dice.getDie2();

    System.out.printf("dice1:%d \t dice2:%d \n",dice1,dice2);

    // 두개의 주사위중 하나라도 1이 나오면 중지
    if(dice1 == 1 || dice2 == 1) {
      System.out.println("꽝!");
      stop = true;
      round = 0;
      // 두개의 주사위 모두 1이 나오면 총점을 0으로
      if(dice1 == 1 && dice2 == 1) {
        total = 0;
      }
    }else {
      round += dice1 + dice2;
      System.out.printf("현 회차 점수:%d\n", round);
      System.out.println("총점 : " + (total + round));

      if ((total + round) >= goal) {
        //게임 종료
        stop = true;
      } else {
        if (limit == ASK) {
          System.out.println("계속 던지시겠습니까? (y/n) ");
          String again = scanner.nextLine();
          stop = !again.equalsIgnoreCase("y");
        } else {
          if (round >= limit) {
            stop = true;
          }
        }
      }
      if (stop) {
        total += round;
        round = 0;
      }
    }
    return stop;
  }
//  getPoints: 선수가 얻은 총점을 반환한다
  public int getTotal(){
    return total;
  }
}
