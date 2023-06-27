package day13.quiz10;

import java.util.Scanner;

public class ClassRollDriver {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Student2 student = null;    // 학생 객체
    String coursename = null;   // 교과목명
    String name = null;         // 추가하는 학생의 이름
    String number = null;       // 추가하는 학생의 학번
    int choice = 0;            // 사용자가 선택하는 연산

//   1.	ClassRoll 객체를 만든다.
    ClassRoll classRoll = new ClassRoll();
//   2.	교과목명을 입력 받아 coursename에 저장한다.
    System.out.print("교과목명 > ");
    coursename = scanner.nextLine();
    classRoll.setCoursename(coursename);

    boolean stop = false;
    do {
//   3.	사용자가 원하는 연산을 선택하게 하고 선택한 값을 choice에 저장한다.
      System.out.println("1.추가 2.삭제 3.찾기 4.출력 5.종료");
      System.out.print("메뉴선택 >> ");
      choice = Integer.parseInt(scanner.nextLine());
      switch (choice) {
//   4.	choice가 1이면 추가하는 학생의 학번과 이름을 입력 받아 학생 객체를 생성한 후 그 객체를 출석부에 추가하고 출력한다.
        case 1 :
          System.out.print("학번 >> "); number = scanner.nextLine();
          System.out.print("이름 >> "); name = scanner.nextLine();
          student = new Student2(number,name);
          classRoll.add(student);
          System.out.println(classRoll);
          break;
//   5.	choice가 2이면 삭제하는 학생의 학번을 입력 받아 해당 학생을 출석부에서 삭제한다.
        case 2 :
          System.out.print("학번 >> "); number = scanner.nextLine();
          classRoll.delete(number);
          System.out.println(classRoll);
          break;
//   6.	choice가 3이면 찾는 학생의 학번을 입력 받아 해당 학생을 출석부에서 찾고 찾았으면 그 학생의 이름을 출력한다.
        case 3 :
          System.out.print("학번 >> "); number = scanner.nextLine();
          name = classRoll.search(number);
          if(name != null) {
            System.out.println(number +"학번의 이름 : " + name);
          }
          break;
//   7.	choice가 4이면 출석부를 출력한다.
        case 4 :
          System.out.println(classRoll);
          break;
//   8.	choice가 5이면 끝내고 아니면 3번으로 간다.
        case 5 :
          stop = true;
          break;
      }
    }while(!stop);
  }
}
