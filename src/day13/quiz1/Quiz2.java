package day13.quiz1;

import java.util.Scanner;

public class Quiz2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numofquestions = 0;       // 문제수
    int[] key = null;             // 정답들의 배열
    int answer = 0;               // 사용자의 답
    int numofcorrectanswers = 0;  // 맞은 답들의 수
    double score = 0;             // 점수

    boolean flag = false;         // 채점 계속여부 확인


    //1.	문제 수를 입력받는다.
    System.out.print("문제수 > ");
    numofquestions = Integer.parseInt(scanner.nextLine());
    //2.	정답들의 배열의 크기를 문제 수로 정한다.
    key = new int[numofquestions];
    do {
      //3.	정답을 입력받는다.
      for (int i = 0; i < key.length; i++) {
        System.out.print("정답" + (i + 1) + " >  ");
        key[i] = Integer.parseInt(scanner.nextLine());
      }
      //4.	사용자의 답을 입력 받아 정답과 비교한다.
      for (int i = 0; i < key.length; i++) {
        System.out.print("사용자의 답" + (i + 1) + " > ");
        answer = Integer.parseInt(scanner.nextLine());
        if (key[i] == answer) {
          numofcorrectanswers++;
        }
      }
      //5.	점수를 계산한다.
      score = (double)numofcorrectanswers / numofquestions * 100;
      //6.	결과를 출력한다.
      System.out.printf("맞은 답수 : %d \n", numofcorrectanswers);
      System.out.printf("점수 : %.2f \n", score);

      //8.	채점의 계속 여부를 물어 사용자의 입력 값을 flag에 저장한다.
      System.out.print("채점을 계속하시겠습니까?(y/n)");
      //9.	numofcorrectanswers = 0; score = 0;
      numofcorrectanswers =0;
      score =0;
      //10.	flag이 ‘y’이면 4번으로 간다.
      String yesOrNo = scanner.nextLine();
      if(!yesOrNo.equalsIgnoreCase("y")){
        flag = true;
      }

    } while (!flag);
    System.out.println("프로그램 종료!");
  }

}
