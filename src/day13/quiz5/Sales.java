package day13.quiz5;

import java.util.Scanner;

public class Sales {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int SALESPEOPLE = 5; //판매원들의 수
    int[] sales = new int[SALESPEOPLE];        //판매원들의 매출액 배열
    int snumber = 0;           //판매원의 번호
    int sum = 0;               //총 매출액
    double average = 0.0;      //평균 매출액
    int maxid = 0;             //최대 매출액를 달성한 판매원 번호
    int maxsales = 0;          //최대 매출액
    int minid = 0;             //최저 매출액를 달성한 판매원 번호
    int minsales = 0;          //최저 매출액

  //    1.	5 명의 판매원들의 번호와 매출액에 입력 받아 sales 배열에 저장한다.
    for (int i = 0; i < sales.length; i++) {
      System.out.print("판매원 번호 > ");
      snumber = Integer.parseInt(scanner.nextLine());
      System.out.print("매출액 > ");
      sales[snumber-1] = Integer.parseInt(scanner.nextLine());
    }
  //    2.	sum = 0
    maxsales = sales[0];
    minsales = sales[0];
    for (int i = 0; i < sales.length; i++) {
  //    3.	sum을 계산한다.
      sum += sales[i];
  //    4.	5 명의 판매원들의 매출액을 서로 비교하여 maxid, maxsales, minid, minsales를 계산한다.
      if(maxsales < sales[i]) {
        maxsales = sales[i];
        maxid = i;
      }
      if(minsales > sales[i]) {
        minsales = sales[i];
        minid = i;
      }
    }
  //    5.	average를 계산한다.
    average = (double)sum / sales.length;
  //    6.	결과 값들을 출력한다.
    System.out.println("총 매출액 : " + sum);
    System.out.println("평균 매출액 : " + average);
    System.out.println("최대매출액 : " + maxsales + " 사원번호 : " + (maxid + 1));
    System.out.println("최소매출액 : " + minsales + " 사원번호 : " + (minid + 1));
  }
}
