package day11.quiz7;

public class Employee {
//    변수들
//	name: 이름
//	jdn: 주민등록번호
//	position: 직위
//	hourlyWages: 시간당 임금
  private String name;
  private String jdn;
  private String position;
  private int hourlyWages;

  //  메소드들
//	getPay: 임금을 계산한다
  public double getPay(int hour) {
    double pay = 0.0;
    if(hour < 0) return 0;

    if(hour <= 40){
      pay = hour * hourlyWages;
    }else{
      pay = hour * hourlyWages * 1.5;
    }

    return pay;
  }

//	raise: 시간당 임금을 증감한다
  public void raise(int hourlyWages) {
    //this.hourlyWages = this.hourlyWages + hourlyWages
    this.hourlyWages +=  hourlyWages;
  }

}
