package day11.exec2.quiz10;

import java.util.Scanner;

public class ScoutDriver {
  public static void main(String[] args) {
    Scout[] gscout = null;     // 걸스카우트 단원들의 배열
    String gscoutname = null; // 걸스카우트 단원의 이름
    int saleweeks = 0;         // 판매 기간
    int saleperweek = 0;       // 주별 판매 상자수

    Scanner scanner = new Scanner(System.in);
    gscout = new Scout[3];

    //1.	세 명의 걸스카우트 단원들의 이름들을 읽어 들여 세 개의 걸스카우트 단원 객체들을 생성한다.
    System.out.println("3명의 단원명을 입력하세요.");
    for (int i = 0; i < gscout.length; i++) {
      System.out.print((i + 1) + "단원의 이름 > ");
      gscoutname = scanner.nextLine();
      gscout[i] = new Scout(gscoutname);
    }
    // 2.	과자 판매가 계속되는 주들의 수를 읽어 들인다.
    System.out.print("판매 기간 > ");
    saleweeks = Integer.parseInt(scanner.nextLine());

    //3.	매 주 각 걸스카우트 단원이 판매한 과자 상자 수들을 입력받는다.
    for (int i = 0; i < saleweeks; i++) {
      System.out.println((i + 1) + "번째주 판매 상자수 입력하세요");
      for (int j = 0; j < gscout.length; j++) {
        System.out.print(gscout[j].getName() + "님이 판매한 과자 상자 수 > ");
        String cntOfBoxStr = scanner.nextLine();
        saleperweek = Integer.parseInt(cntOfBoxStr);
        gscout[j].updateSales(saleperweek);
      }
    }

    //4.	각 걸스카우트 단원에 대해 이름과 총 판매 상자 수를 출력한다.
    for (int i = 0; i < gscout.length; i++) {
      System.out.println(gscout[i]);
    }

  }
}
