package day15.exec1.quiz67;

public class UnGraduate extends Student{
  private String clubName;    //동아리명
  public UnGraduate(String name,String number) {
    super(name,number);
  }

  public void setClubName(String clubName) {
    this.clubName = clubName;
  }

  @Override
  public String toString() {
    return "UnGraduate{" +
        "이름/학번=" + super.toString() +
        "clubName='" + clubName + '\'' +
        '}';
  }
}
