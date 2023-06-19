package day8.exam3;
/*
  final 변수 : 초기화 후 재할당 불가
  final 메소드 : 자식개념에서 재정의(오버라이딩) 불가
  final 클래스 : 하위개념 만들수 없다
 */
public class Person extends Object{
  private String name;
  private int age;

  Person(){
    super(); //부모의 기본 생성자 호출
  }

  void eat(){
    System.out.println("먹다");
  }
}
