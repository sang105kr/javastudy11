package day8.exam2;
/*
  멤버 : 필드,메소드
  this : 향후 생성될 객체(출
  instance)를 지칭하는 예약어
  this() : 다른 생성자 호
 */
public class Person {

  private String name;
  private int age;
  
  //생성자
  Person(){

  }
  Person(String name) {
    this.name = name;
  }

  Person(int age) {
    this.age = age;
  }

  //case1)
//  Person(String name, int age) {
//    this.name = name;
//    this.age = age;
//  }
  //case2)
  Person(String name, int age) {
    //this.name = name;
    this(name); // 첫줄에 한번만 사용할수 있다.
//    this.age = age;
  }

  public void smile(){
    System.out.println("웃다");
  }
  public void eat(){
    System.out.println("먹다");
  }

  //getter setter : 속성을 다른 인스턴스가 읽고 수정하는용도
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
