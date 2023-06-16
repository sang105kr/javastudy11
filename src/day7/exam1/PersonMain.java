package day7.exam1;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person();

    System.out.println(p1.age);
    System.out.println(p1.name);

    p1.eat();
    p1.smile();

    p1.age = 2;
    System.out.println(p1.age);

    p1.name = "홍길동";
    System.out.println(p1.name);

    Person p2 = new Person("홍길서");

    Person p3 = new Person("홍길남", 30);
  }
}
