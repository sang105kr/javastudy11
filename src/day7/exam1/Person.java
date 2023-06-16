package day7.exam1;
/*
  1. 생성자 : 인스턴스를 만들고 속성을 초기화하는 용도
             메소드의 한 종류
             인스턴스를 생성하는 역할
             클래스이름과 동일할 이름을 갖는다.
             반환타입이 없다.
             매개변수가 다른 생성자를 여러기 가질수 있다(overloading)
          ** 기본생성자 : 매개변수가 없는 생성자 ,
                        생성자가 하나라도 정의 안된경우에 한해서 컴파일러가 자동 생성해준다

  2. this : 향후에 인스턴스로 만들어질 대상.
 */
public class Person {
  String name;
  int age;

  Person(){
    age = 1;
  }

  Person(String name) {
    this.name = name;
    this.age = 1;
  }

  Person(String name,int age) {
    this.name = name;
    this.age = age;
  }

  //웃다
  void smile(){
    System.out.println("웃다");
  }
  //먹다
  void eat(){
    System.out.println("먹다");
  }
  
}
