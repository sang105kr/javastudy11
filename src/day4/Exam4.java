package day4;
/*
    자판기 거스름돈 계산
    동전 = 500,100,50,10
 */
public class Exam4 {
  public static void main(String[] args) {
    int[] coinUnit = {500, 100, 50, 10};

    int money = 2680;
    System.out.println("money="+money);

    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i]+"원:" + (money / coinUnit[i]));
      money = money % coinUnit[i];  // money %= coinUnit[i];
    }

    System.out.println(money);

//    money=2680
//    500원:5   <= 2500
//    100원:1   <= 2600
//    50원:1    <= 2650
//    10원:3    <= 2680
  }
}
