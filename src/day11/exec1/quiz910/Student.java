package day11.exec1.quiz910;
/*
  상속에서 제외되는 멤버
    1.상위 클래스의 static멤버
    2.상위 클래스의 private멤버버
*/
public class Student extends Person{

  private String name;
  private String number;      //학번
  private String department;  //학과

  public Student(){
    super();
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", number='" + number + '\'' +
        ", department='" + department + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }
}
