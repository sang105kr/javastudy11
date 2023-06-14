package day5;
/*
  배열 특징 : 1. 여러 값을 하나의 변수에 할당할 수있다. 각요소는 인덱스로 접근
            2.  생성시 요소의 크기는 고정된다. (유동적으로 늘릴수 없다)
 */
public class Exam1 {
  public static void main(String[] args) {
    int x = 10;
    int y = x;                // 값 복사
    System.out.printf("x=%d, y=%d\n", x, y);

    int[] subject = new int[3];
    System.out.println(subject);
    System.out.println(subject[0]);
    System.out.println(subject[1]);
    System.out.println(subject[2]);
//    System.out.println(subject[3]);
    subject[0] = 10; subject[1] = 20; subject[2] =30;

    int[] subject2 = subject;  // 주소 복사
    System.out.println(subject2);
    System.out.println(subject2[0]);
    System.out.println(subject2[1]);
    System.out.println(subject2[2]);
  }
}
