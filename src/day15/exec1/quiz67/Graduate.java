package day15.exec1.quiz67;

public class Graduate extends Student{

  private String assistentType; // 대학원생의 조교 유형
  private double payRate;       // 대학원생의 장학금 비율

  //	생성자메소드: 대학원생의 이름, 학번을 각각 주어진 값으로 초기화하면서 Graduate 객체를 생성한다
  public Graduate(String name, String number) {
    super(name,number);
  }
  //	getAssistentType: 대학원생의 조교 유형을 반환한다
  public String getAssistentType() {
    return assistentType;
  }
  //	getPayRate: 대학원생의 장학금 비율을 반환한다
  public double getPayRate() {
    return payRate;
  }

  //	toString: 대학원생의 현재 상태를 반환한다
  @Override
  public String toString() {
    return "Graduate{" +
        "이름/학번=" + super.toString() +
        "assistentType='" + assistentType + '\'' +
        ", payRate=" + payRate +
        '}';
  }
  //	setAssistentType: 대학원생의 조교 유형을 주어진 값으로 변경한다
  public void setAssistentType(String assistentType) {
    this.assistentType = assistentType;
  }
  // setPayRate: 대학원생의 장학금 비율을 주어진 값으로 변경한다
  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }
}
