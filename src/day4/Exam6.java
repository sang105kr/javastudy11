package day4;
/*
  main메소드에 배열 넘기기
 */
public class Exam6 {
  public static void main(String[] args) {
    int[] coinUnit = {500, 100, 50, 10};

//    int money = 2_680;
//    String tmp = args[0];   // "123"
//    int money = Integer.parseInt(tmp);   // "2680" => 2680
    int money = Integer.parseInt(args[2]);
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
