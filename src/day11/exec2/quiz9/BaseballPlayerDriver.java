package day11.exec2.quiz9;

import java.util.Scanner;

public class BaseballPlayerDriver {
  public static void main(String[] args) {
    String bpname = null;     // 입력받은 선수 이름
    String bpposition = null;  // 입력받은 선수 위치
    int nohits = 0;           // 입력받은 선수 안타수
    int nowalks = 0;          // 입력받은 선수 4구수
    int sumhits = 0;          // 선수들의 안타수들의 합
    int sumwalks = 0;         // 선수들의 4구수들의 합
    BaseballPlayer[] bp = new BaseballPlayer[2];  // 야구 선수들의 배열
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < bp.length; i++) {
      System.out.print("선수 이름 > ");
      bpname = scanner.nextLine();
      System.out.print("선수 위치 > ");
      bpposition = scanner.nextLine();
      System.out.print("선수 안타수 > ");
      nohits = Integer.parseInt(scanner.nextLine());
      System.out.print("선수 4구수 > ");
      nowalks = Integer.parseInt(scanner.nextLine());

      bp[i] = new BaseballPlayer(bpname);
      bp[i].setPosition(bpposition);
      bp[i].setNumHits(nohits);
      bp[i].setNumWalks(nowalks);
    }

    for (int i = 0; i < bp.length; i++) {
      //case1)
      //System.out.println(bp[i]);
      //case2)
      System.out.printf("이름 : %s\t", bp[i].getName());
      System.out.printf("위치 : %s\t", bp[i].getPosition());
      System.out.printf("안타수 : %s\t", bp[i].getNumHits());
      System.out.printf("4구수 : %s\t", bp[i].getNumWalks());
      System.out.println();

      sumhits += bp[i].getNumHits();
      sumwalks += bp[i].getNumWalks();
    }

    System.out.printf("안타수 : %d \t 4구수 : %d", sumhits, sumwalks);
  }
}
