package day4;
/*
  향상된 for문 = for~each
  for( 요소를 받는 변수 : 배열 or 컬렉션){}
 */
public class Exam7 {
  public static void main(String[] args) {
    int[] subject = {80, 90, 100};

    // 일반 for문
    for (int i = 0; i < subject.length; i++) {
      System.out.println(subject[i]);
    }
    System.out.println("--------------");
    // 향상된 for문 : 모든요소를 순차적으로 접근하려는 용도로 사용!
    for (int ele : subject) {
      System.out.println(ele);
    }
  }
}
