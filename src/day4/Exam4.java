package day4;
/*
    동전교환기
    동전 = 500,100,50,10
 */
public class Exam4 {
  public static void main(String[] args) {
    int[] coinUnit = {500, 100, 50, 10};
    //case1)
    //int[] coinUnit = new int[]{500, 100, 50, 10};
    //case2)
    //int[] coinUnit = new int[5];
    //coinUnit[0] = 500; coinUnit[1] = 100; coinUnit[2] = 50; coinUnit[3] = 10;

    int money = 2_680;
    System.out.println("money="+money);

    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i]+"원:" + (money / coinUnit[i]));
      money %= coinUnit[i];  // money = money % coinUnit[i];
    }

    System.out.println(money);

//    money=2680
//    500원:5   <= 2500
//    100원:1   <= 2600
//    50원:1    <= 2650
//    10원:3    <= 2680
  }
}
