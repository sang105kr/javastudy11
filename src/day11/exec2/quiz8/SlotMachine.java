package day11.exec2.quiz8;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    boolean stop = false;
    do {
      int number1 = 0, number2 = 0, number3 = 0;

      number1 = random.nextInt(10)+1;
      number2 = random.nextInt(10)+1;
      number3 = random.nextInt(10)+1;

      System.out.printf("%d %d %d ==> ",number1,number2,number3);

      if (number1 == number2 && number2 == number3) {
        System.out.println("1등!");
      } else if (number1 == number2 || number2 == number3 || number3 == number1) {
        System.out.println("2등");
      } else{
        System.out.println("꽝!");
      }
      System.out.print("계속 하시겠습니까?(예/아니오)");
      String answer = scanner.nextLine();
      if (answer.equals("아니오")) {
        stop = true;
      }
    } while (!stop);
    System.out.println("프로그램 종료!");
  }
}
