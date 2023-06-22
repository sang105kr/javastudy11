package day11.exec2.quiz1;

public class Student {
  private String studentNumber; //학번
  private String name; //이름
  private int testScore1; //시험점수
  private int testScore2; //시험점수
  private int testScore3; //시험점수

  public Student(String studentNumber, String name, int testScore1, int testScore2, int testScore3) {
    this.studentNumber = studentNumber;
    this.name = name;
    this.testScore1 = testScore1;
    this.testScore2 = testScore2;
    this.testScore3 = testScore3;
  }

  public void setScore(int testNumber, int testScore) {
    switch (testNumber) {
      case 1:
        testScore1 = testScore;
        break;
      case 2:
        testScore2 = testScore;
        break;
      case 3:
        testScore3 = testScore;
        break;
      default:
        System.out.println("시험 번호는 1~3사이의 정수여야 합니다..");
    }
  }

  public int getScore(int testNumber) {
    int score = -1;
    if (testNumber == 1) {
      score = testScore1;
    } else if (testNumber == 2) {
      score = testScore2;
    } else if (testNumber == 3) {
      score = testScore3;
    } else {
      System.out.println("시험 번호는 1~3사이의 정수여야 합니다..");
    }
    return score;
  }

  public double getAverage() {
    double value = 0.0;
    value = (double)(testScore1 + testScore2 + testScore3) / 3;
    return value;
    //return (double)(testScore1 + testScore2 + testScore3) / 3;
  }

  @Override
  public String toString() {
    return "Student{" +
        "studentNumber='" + studentNumber + '\'' +
        ", name='" + name + '\'' +
        ", testScore1=" + testScore1 +
        ", testScore2=" + testScore2 +
        ", testScore3=" + testScore3 +
        '}';
  }
}
