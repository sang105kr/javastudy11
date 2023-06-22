package day11.exec1.quiz12;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    
    p1.setLastName("홍");
    p1.setFirstName("길동");
    
    String firstName = p1.getFirstName();
    String lastName = p1.getLastName();
    int length = p1.getLength();

    System.out.println("성 : " + lastName);
    System.out.println("이름 : " + firstName);
    System.out.println("이름의 글자수 : " + length);

    Person p2 = new Person("홍","길서");
    firstName = p2.getFirstName();
    lastName = p2.getLastName();
    length = p2.getLength();

    System.out.println("성 : " + lastName);
    System.out.println("이름 : " + firstName);
    System.out.println("이름의 글자수 : " + length);
  }
}
