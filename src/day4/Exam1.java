package day4;
/*
  국,영,수 총계와 평균을 구하는 프로그램을 구현하시오.
 */
public class Exam1 {
  public static void method1(){
    int kor = 70;
    int eng = 85;
    int math = 90;

    int total = kor + eng + math;
    double avg = (double)total / 3;

    System.out.printf("총계=%d \t 평균=%.2f\n", total, avg);
  }
  public static void method2(){
    int[] subject;          //정수형 배열 선언
    subject = new int[3];   //정수형 배열 생성, 초기화는 배열 타입에 따라 기본값이 정해진다.
    // int[] subject = new int[3];
    System.out.printf("%d,%d,%d\n",subject[0],subject[1],subject[2]);
    subject[0] = 70;
    subject[1] = 85;
    subject[2] = 90;

    int total = 0;
    for (int i = 0; i < subject.length; i++) {
      total += subject[i]; // total = total + subject[i];  // i-> 0,1,2
    }
//    int total = subject[0] + subject[1] + subject[2];
    double avg = (double)total / subject.length;

    System.out.printf("총계=%d \t 평균=%.2f\n", total, avg);
  }

  public static void main(String[] args) {
    method1();
    method2();
  }
}
