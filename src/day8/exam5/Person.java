package day8.exam5;
/*
    Object클래스의 toString()메소드 용도
    : 인스턴스의 상태(속성값)를 문자열로 표현
 */
public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

//  @Override // : 메소드 재정의하겠다고 명시적으로 컴파일러에게 알려주는정보
//  public String toString(){
//    return this.name + "-" + this.age;
//  }

  @Override
  public String toString() {
    return this.name + "-" + this.age;
  }
}
