package day1;
/*
  국,영,수 점수의 총계와 평균을 구하는 프로그램을 작성하시오.
 */
public class Exam4 {
  public static void main(String[] args) {
    int kor = 90;
    int eng = 85;
    int math = 70;

    int sum = kor + eng + math;  //총계
    double avg = sum / (double)3;        //평균

    System.out.println("국어점수 : " + kor);
    System.out.println("영어점수 : " + eng);
    System.out.println("수학점수 : " + math);
    System.out.println("총계 : " + sum);
    System.out.println("평균 : " + avg);
  }
}
