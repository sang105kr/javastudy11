package day11.exec2.quiz12;

import day11.exec2.quiz5.Die;

public class PairOfDice {

  private Die	die1, die2;   //주사위 2개 참조
  private int	value1;       //첫번째 주사위 숫자
  private int value2;       //두번째 주사위 숫자
  private int total;        //주사위 숫자들의 합

//	생성자 메소드: 두 개의 주사위 객체들을 생성한다
  public PairOfDice(){
    die1 = new Die();
    die2 = new Die();
    value1 = 1;
    value2 = 1;
    total = value1 + value2;
  }
//	roll: 주사위 두 개를 던지고 숫자들의 합을 반환한다
  public int roll(){
    die1.roll();
    die2.roll();
    value1 = die1.getFaceValue();
    value2 = die2.getFaceValue();
    total = value1 + value2;
    return total;
  }
//	getDie1: 첫번째 주사위 숫자를 반환한다
  public int getDie1() {
    return value1;
  }

//	getDie2: 두번째 주사위 숫자를 반환한다
  public int getDie2() {
    return value2;
  }

//	getTotal: 주사위 숫자들의 합을 반환한다
  public int getTotal() {
    return total;
  }

}
