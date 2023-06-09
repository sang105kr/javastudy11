package day2;

/*
    for(초기식;조건식;증감식){
        실행문;
    }
*/

import java.util.Scanner;

public class For1 {
  public static void main(String[] args) {
    int sum = 1+2+3+4+5;
    System.out.println("sum="+sum);

    int sum2 = 0;
    for(int i = 5; i >= 1; i = i - 1 ) {
      sum2 = sum2 + i;
    }
    System.out.println("sum2="+sum2);

    int sum3 = 0;
    for(int i=1; i<=100 ; i=i+1){
      sum3 = sum3 + i;
    }
    System.out.println("sum3="+sum3);

    Scanner scanner = new Scanner(System.in);
    System.out.print("단수 : ");
    String num = scanner.nextLine();

    int dansu = Integer.parseInt(num);
    for (int i = 1; i <= 9; i = i + 1) {
      System.out.println(dansu + " * " + i + " = " + (dansu * i));
    }
  }
}
