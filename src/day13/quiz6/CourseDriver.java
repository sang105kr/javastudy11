package day13.quiz6;

public class CourseDriver {
  public static void main(String[] args) {

    Course cos = null;        //Course 객체

//    1.	‘자바프로그래밍’라는 이름을 가진 Course 객체를 만든다.
    cos = new Course("자바프로그래밍");
//    2.	Course 객체에 번호가 7101이고 시험 점수들이 96, 87, 92인‘홍길동’이라는 이름을 가진 학생을 추가한다.
    cos.addStudent(7101,96,87,92,"홍길동");
//    3.	Course 객체에 번호가 7106이고 시험 점수들이 72, 90, 78인‘김갑돌’이라는 이름을 가진 학생을 추가한다.
    cos.addStudent(7106,72,90,78,"김갑돌");
//    4.	Course 객체에 번호가 7132이고 시험 점수들이 63, 84, 82인‘이갑순’이라는 이름을 가진 학생을 추가한다.
    cos.addStudent(7132,63,84,82,"이갑순");

    // 과정 상태를 문자열로 표현
    System.out.println(cos);

    System.out.printf("교과목 전체평균=%.2f \n" ,cos.getAverage());

  }
}
