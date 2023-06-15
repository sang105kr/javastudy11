package day6.exam1;

public class Person {
  // 명사, 필드
  String name;      //이름
  int  age;         //나이

  // 생성자(constructor)
  Person(String name, int age){
    this.name = name; //this : 생성될 객체
    this.age = age;
  }

  // 동사, 메소드
  // 웃다
  public void smile(){
    System.out.println("웃다");
  }
  // 먹는다
  public void eat() {
    System.out.println("먹다");
  }
}
