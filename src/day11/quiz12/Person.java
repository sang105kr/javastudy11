package day11.quiz12;

public class Person {
  private String lastName; //성
  private String firstName; //이름

  public Person(){
    super();
  }
  public Person(String lastName, String firstName) {
    super();
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getLength() {
    int lenOfLastName = lastName.length();
    int lenOfFirstName = firstName.length();

    return lenOfLastName + lenOfFirstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
