package day5;
//문제)배열을 사용하여 학생수많큼 점수를 입력받고
//    분석(최고득점,평균) 할수있다.
//    ------------------------------------------------------
//    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
//    ------------------------------------------------------
//    선택>>
//
//    1번선택시 학생수입력
//    학생수> 4
//
//    2번선택시 점수를 키보드로 학생수 많큼 입력받는다
//    점수1> 90
//    점수2> 70
//    점수3> 60
//    점수4> 80
//
//    3번 선택시 입력된 점수 목록을 보여준다
//    score[0] = 90
//    score[1] = 70
//    score[2] = 60
//    score[3] = 80
//
//    4번 선택시
//    최고점수 = 90
//    평균 = 75
//
//    5번 선택시 아래 메세지 출력후 종료함
//    프로그램 종료!!

import java.util.Scanner;

public class Problem2 {
  public static void printDash(int cnt){
    for (int i = 0; i < cnt; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean stop = false;
    int[] score = null;

    while (!stop) {
      printDash(50);
      System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
      printDash(50);
      System.out.print("선택>> ");
      String selectedNum = scanner.nextLine();
      switch (selectedNum) {
        case "1":  //학생수
          System.out.print("학생수> ");
  //        String countOfStudent = scanner.nextLine();
  //        int cnt = Integer.parseInt(countOfStudent);
          int countOfStudent = Integer.parseInt(scanner.nextLine());
          score = new int[countOfStudent];

          break;
        case "2":  //점수입력
          if(score == null) {
            System.out.println("학생수를 먼저 입력바랍니다");
            continue;
          }
          for (int i = 0; i < score.length; i++) {
            System.out.print("점수"+(i+1)+">> ");
            int jumsu = Integer.parseInt(scanner.nextLine());
            score[i] = jumsu;
          }
          break;
        case "3":
          if(score == null) {
            System.out.println("학생수를 먼저 입력바랍니다");
            continue;
          }
          for (int i = 0; i < score.length; i++) {
            System.out.println("score["+i+"]=" + score[i]);
          }
          break;
        case "4": // 분석
          if(score == null) {
            System.out.println("학생수를 먼저 입력바랍니다");
            continue;
          }
          // 최대값
          int max = score[0];
          for (int i = 1; i < score.length; i++) {
            if(max < score[i]){
              max = score[i];
            }
          }
          // 평균
          int sum = 0;
          for (int i = 0; i < score.length; i++) {
            sum += score[i];
          }
          double avg = sum / (double)score.length;

          System.out.println("최대값="+max);
          System.out.println("평균="+avg);
          break;
        case "5": // 종료
          stop = true;
          break;
        default:
          System.out.println("1~5 번에서 고르세요");
      }
    }
    System.out.println("프로그램 종료!");
  }
}
