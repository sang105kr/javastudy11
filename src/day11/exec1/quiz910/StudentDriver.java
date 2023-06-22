package day11.exec1.quiz910;

public class StudentDriver {
  public static void main(String[] args) {

    Student student1 = null, student2 = null;

    student1 = new Student();
    student1.setName("홍길동");
    student1.setNumber("1111");
    student1.setDepartment("컴공");
    System.out.println(student1);

    student2 = new Student();
    student2.setName("홍길서");
    student2.setNumber("2222");
    student2.setDepartment("건축");
    System.out.println(student2.toString());

    student2.setDepartment("수학");
    System.out.println(student2);

    student1.smile();
    student2.smile();

  }
}
