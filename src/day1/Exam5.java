package day1;

import java.util.Scanner;

/*
  국,영,수 점수의 총계와 평균을 구하는 프로그램을 작성하시오.
 */
public class Exam5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("국어점수 : ");
    int kor = Integer.valueOf(scanner.nextLine());
    System.out.print("영어점수 : ");
    int eng = Integer.valueOf(scanner.nextLine());
    System.out.print("수학점수 : ");
    int math = Integer.valueOf(scanner.nextLine());

    int sum = kor + eng + math;  //총계
    double avg = sum / (double)3;        //평균

//    System.out.println("국어점수 : " + kor);
//    System.out.println("영어점수 : " + eng);
//    System.out.println("수학점수 : " + math);
    System.out.println("총계 : " + sum);
    System.out.println("평균 : " + avg);
  }
}
