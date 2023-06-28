package day15.exec1.quiz67;

public class Student {
  private String name;        //학번
  private String number;      //학번

  public Student(String name, String number) {
    // super();
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public String getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", number='" + number + '\'' +
        '}';
  }
}
