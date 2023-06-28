package day15.exec1.quiz1;

public class MonetaryCoinDriver {
  public static void main(String[] args) {

    MonetaryCoin[] coins = null; // MonetaryCoin 객체들의 배열
    int sum = 0;                // 동전 값들의 합

//  1.	MonetaryCoin 객체들의 배열을 만든다.
    coins = new MonetaryCoin[4];
//  2.	다른 금액의 MonetaryCoin 객체들을 만든다.
    coins[0] =  new MonetaryCoin(10);
    coins[1] =  new MonetaryCoin(50);
    coins[2] =  new MonetaryCoin(100);
    coins[3] =  new MonetaryCoin(500);
//  3.	모든 동전들을 던진다
    for (int i = 0; i < coins.length; i++) {
      coins[i].flip();
    }
//  4.	sum = 0
//  5.	동전 값들의 합을 구하여 sum에 저장한다
    for (int i = 0; i < coins.length; i++) {
      sum += coins[i].getValue();
    }
//  6.	동전들의 현 상태를 출력한다
    for (int i = 0; i < coins.length; i++) {
      System.out.println(coins[i]);
    }
//  7.	동전 값들의 합을 출력한다.
    System.out.println("동전의 합 : " + sum);
  }
}
