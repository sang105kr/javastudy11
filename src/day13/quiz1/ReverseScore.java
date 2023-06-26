package day13.quiz1;

import java.util.Scanner;

public class ReverseScore {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] scores = null;          //점수들의 배열
    int numscores = 0;            // 점수들의 수
    int tempscore = 0;           // 한 점수를 저장하기 위한 변수

//    1.	입력할 점수들의 수를 입력받는다.
    System.out.print("입력할 점수들의 수 > ");
//    2.	numscores = 입력 받은 점수들의 수
    numscores = Integer.parseInt(scanner.nextLine());
    scores = new int[numscores];
//    3.	numscores 수만큼 점수들을 읽어 scores 배열에 저장한다.
    for (int i = 0; i < scores.length; i++) {
      System.out.print("점수" + (i + 1) + " > ");
      scores[i] = Integer.parseInt(scanner.nextLine());
    }
//    4.	scores 배열의 내용을 출력한다.
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("scores[%d]=%d",i,scores[i]);
      System.out.println();
    }
//    5.	i = 0부터 numscores/2 까지 i를 1만큼 증가시키면서 다음을 반복한다:
    for (int i = 0; i < numscores/2; i++) {
      tempscore = scores[i];
    	scores[i] = scores[numscores - 1 - i];
      scores[numscores - 1 - i] = tempscore;
    }
//    6.	scores 배열의 내용을 출력한다.
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("scores[%d]=%d",i,scores[i]);
      System.out.println();
    }
  }
}
