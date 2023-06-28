package day14.exam1;

public class Main2 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.study();

    Person p1 = s1;
    Object o1 = p1;

    Student s2 = (Student)p1;
    s2.study();


    Person p2 = new Person();
    Student s3 = (Student) p2;
    s3.study();

  }
}
