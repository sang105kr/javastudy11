package day3;

import java.util.Scanner;

/*
  사용자로부터 시작값과 종료값을 입력받아 해당구간의 홀수합, 짝수합 , 총합을
  산출하는 프로그램을 작성하시오. 단. 시작값으로 'X'를 입력하면 프로그램 종료.
  ex) 시작 : 10
      종료 :  100
      짝수합 :
      홀수합 :
      총합 :
 */
public class Exam3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean stop = false;

    while (!stop) {
      System.out.print("시작 : ");
      String start = scanner.nextLine();           // "10"
      if(start.equalsIgnoreCase("X")){
//        break;  // 반복문내에서 가장 가까운 반복문 1개를 빠져나온다.
        stop = true;
        continue;
      }

      int startNumber = Integer.parseInt(start);  // 10

      System.out.print("종료 : ");
      String end = scanner.nextLine();           // "100"
      int endNumber = Integer.parseInt(end);  //     100

      int sumOfOdd = 0;  //홀수
      int sumOfEven = 0; //짝수
      int total = 0;     //총계

      for (int i = startNumber; i <= endNumber; i++) {
        if (i % 2 == 0) {
          sumOfEven += i;   // sumOfEven = sumOfEven + i;
        } else {
          sumOfOdd += i;   // sumOfOdd = sumOfOdd + i;
        }
        total += i;       // total = total + 1;
      }

      System.out.println("시작 : " + startNumber);
      System.out.println("종료 : " + endNumber);
      System.out.println("홀수의 합 = " + sumOfOdd);
      System.out.println("짝수의 합 = " + sumOfEven);
      System.out.println("전체의 합 = " + total);
    }

    System.out.println("프로그램 종료!");
  }
}
