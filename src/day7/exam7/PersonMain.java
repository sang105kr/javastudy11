package day7.exam7;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person("길동 홍", 30);

    String name = p1.getName();
    System.out.println(name);

    String firstName = p1.getFirstName();
    System.out.println(firstName);

  }
}
