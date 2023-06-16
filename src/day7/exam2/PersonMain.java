package day7.exam2;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person("홍길동");

    System.out.println(p1.name);
    System.out.println(p1.age);

    p1.name = "홍길동";
    p1.age = 30;

    System.out.println(p1.name);
    System.out.println(p1.age);

  }
}
