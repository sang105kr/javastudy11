package day6.exam1;

import java.util.Scanner;

public class PersonMain {
  public static void main(String[] args) {

    Person p1 = new Person("홍길동",10);
    Person p2 = new Person("홍길서",20);
    Person p3 = new Person("홍길남",30);

    p1.eat();
    p1.smile();
    System.out.println(p1.age);
    System.out.println(p1.name);

    p2.eat();
    p2.smile();
    System.out.println(p2.age);
    System.out.println(p2.name);

    p3.eat();
    p3.smile();
    System.out.println(p3.age);
    System.out.println(p3.name);
  }
}
