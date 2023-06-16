package day7.exam1;

public class PersonMain2 {
  public static void main(String[] args) {
    Person[] persons = new Person[3];
    persons[0] = new Person("홍길동");

    System.out.println(persons);
    System.out.println(persons[0]);
    System.out.println(persons[0].age);
    System.out.println(persons[0].name);
    persons[0].smile();
    persons[0].eat();
  }
}
