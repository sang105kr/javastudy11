package day13.quiz6;

public class Student {
  private int sno;        //학번
  private int score1;     //점수1
  private int score2;     //점수2
  private int score3;     //점수3
  private String name;    //이름

  public Student(int sno, int score1, int score2, int score3, String name) {
    this.sno = sno;
    this.score1 = score1;
    this.score2 = score2;
    this.score3 = score3;
    this.name = name;
  }

  public double getAverage(){
    return (double)(score1 + score2 + score3)/3;
  }

  @Override
  public String toString() {
    return "Student{" +
        "sno=" + sno +
        ", score1=" + score1 +
        ", score2=" + score2 +
        ", score3=" + score3 +
        ", name='" + name + '\'' +
        '}';
  }
}
