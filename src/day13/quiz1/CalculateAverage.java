package day13.quiz1;

import java.util.Scanner;

public class CalculateAverage {
  public static void main(String[] args) {

    int[] scores = new int[10]; // 정수들의 배열
    int sum;                // 합
    double average = 0.0;       // 평균

    Scanner scanner = new Scanner(System.in);
//
//
//1.	sum = 0
    sum = 0;
//2.	다음을 10번 반복한다:
    for (int i = 0; i < scores.length; i++) {
//  ①	정수를 읽어 들인다.
      System.out.print("정수" + (i + 1) + " > ");
      String value = scanner.nextLine();
      scores[i] = Integer.parseInt(value);
//  ②	sum = sum + 읽어 들인 정수
      sum += scores[i];
    }
//3.	average = sum / 10
    average = (double)sum / scores.length;
//4.	sum과 average를 출력한다.
    System.out.printf("sum=%d \t average=%.2f",sum,average);

  }
}
