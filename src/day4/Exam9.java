package day4;
/*
  null : 참조타입에 사용되며 참조하는 값이 없음을 의미
 */
public class Exam9 {
  public static void main(String[] args) {
    int[] subject = null;
    //int kor = null;
    System.out.println(subject);

    subject = new int[3];
    System.out.println(subject);  // 참조변수의 주소

    for (int i = 0; i < subject.length; i++) {
      System.out.println(subject[i]);  // 참조변수의 주소가 가리키는 요소
    }
  }
}
