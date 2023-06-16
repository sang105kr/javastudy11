package day7.exam8;

public class Person {
  private String name;
  private int age;

  public Person(String name) {
    this.name = name;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void smile(){
    System.out.println("웃다");
  }
  public void eat(){
    System.out.println("먹다");
  }

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