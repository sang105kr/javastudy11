package day4;

public class Exam2 {
  public static void main(String[] args) {
    int[] subject;            // 정수형 배열 선언
    subject = new int[10];    // 10개의 정수값을 가질수 있는 배열 생성되고 각요소의 값은 0으로 초기화됨
    for (int i = 0; i < subject.length; i++) {
      System.out.println(subject[i]);
    }

    int[] subject2 = new int[3];       // 배열선언, 배열생성, 배열요소의 초기값은 타입의 기본값으로 초기화
    for (int i = 0; i < subject2.length; i++) {
      System.out.println(subject2[i]);
    }
    int[] subject3 = new int[]{10,20,30};  // 배열선언, 배열생성, 배열요소의 초기값을 원하는 값으로 초기화
    for (int i = 0; i < subject3.length; i++) {
      System.out.println(subject3[i]);
    }
    int[] subject4 = {10,20,30};  // 배열선언, 배열생성, 배열요소의 초기값을 원하는 값으로 초기화
    for (int i = 0; i < subject4.length; i++) {
      System.out.println(subject4[i]);
    }

    int[] subject5;
    subject5 = new int[]{1,2,3};    //배열 선언과 생성을 분리해서 작성할수 있다.
    //subject5 = {1,2,3};          // 배열 선언과 생성을 분리해서 작성할수 없다.


  }
}
