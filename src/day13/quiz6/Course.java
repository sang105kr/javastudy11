package day13.quiz6;

import java.util.Arrays;

public class Course {

  private String coursename;        // 교과목명
  private Student[] students;       // Student 객체들의 배열
  private int count;                // 학생들의 갯수

  //생성자메소드: 비어있는  배열 객체를 만든다
  public Course(String coursename) {
    this.coursename = coursename;
    students = new Student[100];
  }

  //addStudent: 현 Course 객체에 한 Student 객체를 추가한다
  public void addStudent(int sno, int score1,int score2,int score3, String name){
    students[count] =  new Student(sno,score1,score2,score3,name);
    count++;
  }
  //getAverage: 교과목 수강 학생들의 시험 점수들의 평균을 구한다
  public double getAverage(){
    double sum = 0.0;
    double avg = 0.0;
    for (int i = 0; i < count; i++) {
      //모든 학생의 평균의 합
      sum = students[i].getAverage();
    }
    avg = sum /count;
    return avg;
  }
  //toString: 현 Course 객체의 상태를 문자열로 반환한다

  @Override
  public String toString() {
    String str = "교과목명 : " + coursename +"\n";

    for (int i = 0; i < count; i++) {
      str += students[i].toString() + "\n";
    }
    return str;
//    return "Course{" +
//        "coursename='" + coursename + '\'' +
//        ", students=" + Arrays.toString(students) +
//        ", count=" + count +
//        '}';
  }
}
