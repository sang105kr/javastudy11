package day7.exam3;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동",30);

    String name = p1.getName();
    System.out.println(name);

    System.out.println(p1.getAge());

    System.out.println(p1.getNickname());
    p1.setNickname("별칭");
    System.out.println(p1.getNickname());
    p1.setNickname("별칭2345");
    System.out.println(p1.getNickname());

    p1.eat();
    p1.smile();
  }
}
