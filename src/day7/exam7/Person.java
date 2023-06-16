package day7.exam7;

public class Person {
  
  private String name;
  private int age;

  Person(String name) {
    this.name = name;
  }

  Person(String name, int age) {
    this.name =name;
    this.age = age;
  }
  
  public void smile(){
    System.out.println("웃다");
  }

  public void eat() {   //"sanghak yi"
    System.out.println("먹다");
  }

  public String getFirstName(){
    String[] tmp = this.name.split(" ");
    return tmp[1];
  }

  public String getName(){
    String[] tmp = this.name.split(" ");
    return tmp[0];
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age) {
    if( age < 1 || age > 150) {
      return;
    }
    this.age = age;
  }

}
