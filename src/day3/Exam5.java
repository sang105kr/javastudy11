package day3;

/*
  for문 연습
  별표 출력하기 5행 5열
  문1)      문2)     문3)     문4)            문5)
  *****     *       *****     *********       *
  *****     **      ****       *******       ***
  *****     ***     ***         *****       *****
  *****     ****    **           ***       *******
  *****     *****   *             *       *********
 */
public class Exam5 {
  public static void printStar1() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printStar2() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.printf("*");
      }
      System.out.println();
    }
  }

  public static void printStar3() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.printf("*");
      }
      System.out.println();
    }
  }

  public static void printStar4(){

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i  ; j++) {
        System.out.print(" ");
      }
      for (int j = 2*5-1; j > 2*i ; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printStar5(){

    for (int i = 0; i < 5; i++) {
      for (int j = 5-1; j > i  ; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2*i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


  public static void printStar6(){
    int num = 10;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < i  ; j++) {
        System.out.print(" ");
      }
      for (int j = 2*num-1; j > 2*i ; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printStar7(){
    int num = 10;
    for (int i = 0; i < num; i++) {
      for (int j = num-1; j > i  ; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2*i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    printStar1();
    printStar2();
    printStar3();
    printStar4();
    printStar5();
    printStar6();
    printStar7();
  }
}
