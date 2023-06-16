package day7.exam2;
/*
  접근 제한자 : 클래스, 필드, 메소드
    public  : 어디든 접근 가능
    protected
    default : 동일 패키지
    private : 동일 클래스내
 */
public class Person {
  String name;
  int age;

  Person(){}
  Person(String name) {
    this.name = name;
  }
}
