package day4;

/*
    자판기 거스름돈 계산
    동전 = 500,100,50,10
    모든 동전이 각각 5개 있다고 가정할때,
      보유한 동전이 부족하면 '거스름돈 부족'출력 후 프로그램 종료
      보유한 동전이 충분하면 거스름돈 내어주고 남은 동전의 개수를 화면에 출력
 */
public class Exam5 {
  public static void main(String[] args) {
    int[] coinUnit = {500, 100, 50, 10};
    int[] coinCnt = {5, 5, 5, 5};  //2500+500+250+50 = 3300

    int money = 2_680;
    System.out.println("money=" + money);

    for (int i = 0; i < coinUnit.length; i++) {
      //1) 필요동전 갯수 구하기
      int coinNum = money / coinUnit[i];

      //2) 남은 동전 계산하기기
      if (coinCnt[i] >= coinNum) {
        coinCnt[i] -= coinNum;
      } else {
        coinNum = coinCnt[i];
        coinCnt[i] = 0;
      }
      //3) 거스름돈 잔액
      money -= coinNum * coinUnit[i]; // 800=3300-2500,   300=800-500   50=300-250, 0=50-50

      System.out.println(coinUnit[i] + "원: " + coinNum);  //
    }
    if (money > 0) {
      System.out.println("거스름돈 부족!");
      System.exit(0); //프로그램 종료
    }

    //남은동전 갯수
    System.out.println("== 남은 동전 갯수 ==");
    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i] + "원:" + coinCnt[i]);
    }
  }
}
//    money=2680
//    500원:5   <= 2500
//    100원:1   <= 2600
//    50원:1    <= 2650
//    10원:3    <= 2680
