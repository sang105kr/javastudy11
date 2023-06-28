package day15.exec2.quiz1234;

public class OverPayCalculator extends  BasicPayCalculator{
  private int	satHours;       // 토요일 근무 시간
  private int sunHours;       // 일요일 근무 시간


  //	생성자 메소드: 직원의 평일 시간당 임금을 주어진 값으로 초기화하고 평일 근무 시간, 토요일 근무 시간과 일요일 근무 시간을 각각 0으로 초기화하면서 객체를 생성한다
  public OverPayCalculator(int payRate) {
    super(payRate);
//    super.setHours(hours);
//    this.satHours = satHours;
//    this.sunHours = sunHours;
  }
//	getPay: 직원의 주급을 계산한 후 반환한다
  @Override
  public double getPay() {
    double weeklyPay;
    if(hours <= 40) {
      weeklyPay = payRate * hours;
    }else{
      weeklyPay = (payRate * 40) + (payRate * (hours-40) * 1.5); //정상근무 + 초과근무
    }
    return weeklyPay;
  }

  //	setSatHours: 직원의 토요일 근무 시간을 주어진 값으로 변경한다
  public void setSatHours(int satHours) {
    this.satHours = satHours;
  }

//	setSunHours: 직원의 일요일 근무 시간을 주어진 값으로 변경한다
  public void setSunHours(int sunHours) {
    this.sunHours = sunHours;
  }

}
