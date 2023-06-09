package day2;

import java.util.Scanner;

/*
  가위 바위 보 게임
 */
public class RockGame2 {

  // 정수(1,2,3)를 입력받아 문자열(가위,바위,보)을 반환
  public static String chageString(int n) {
    String str = null;

    switch (n) {
      case 1:
        str = "가위";
        break;
      case 2:
        str = "바위";
        break;
      case 3:
        str = "보";
        break;
    }
    return str;
  }


  public static void main(String[] args) {
    //1. 컴퓨터
    int computer = (int) (Math.random() * 3) + 1;  // 1 ~ 3;

    //2. 사용자
    Scanner scanner = new Scanner(System.in);
    System.out.print("가위(1), 바위(2), 보(3) 선택 : ");
    String choice = scanner.nextLine();
    int person = Integer.parseInt(choice);

    //3. 판단
    // 가위-바위, 가위-보  / 바위-가위, 바위-보 / 보-가위, 보-바위
    int result;   // person기준 1:이김, 2:짐, 0:비김
    //비김
    if (person == computer) {
      result = 0;
      //이김  
    } else if (person == 1 && computer == 3 || person == 2 && computer == 1 || person == 3 && computer == 2) {
      result = 1;
      //짐  
    } else {
      result = 2;
    }

    //4. 결과
    String comChoice = chageString(computer);
//    switch (computer) {
//      case 1:
//        comChoice = "가위";
//        break;
//      case 2:
//        comChoice = "바위";
//        break;
//      case 3:
//        comChoice = "보";
//        break;
//    }

    String perChoice = chageString(person);
//    switch (person) {
//      case 1:
//        perChoice = "가위";
//        break;
//      case 2:
//        perChoice = "바위";
//        break;
//      case 3:
//        perChoice = "보";
//        break;
//    }

    System.out.println("컴퓨터 : " + comChoice);
    System.out.println("나 : " + perChoice);

    switch (result) {
      case 0: //비김
        System.out.println("비겼습니다.");
        break;
      case 1: //이김
        System.out.println("당신이 이겼습니다.");
        break;
      case 2: //짐
        System.out.println("당신이 졌습니다.");
        break;
    }
  }
}
