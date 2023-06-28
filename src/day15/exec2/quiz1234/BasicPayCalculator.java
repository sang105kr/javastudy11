package day15.exec2.quiz1234;

abstract public class BasicPayCalculator {

  protected int payRate;      //평일 시간당 임금
  protected int hours;        //평일 근무시간

//	생성자 메소드: 직원의 평일 시간당 임금을 주어진 값으로 초기화하고 평일 근무 시간은 0으로 초기화하면서 객체를 생성한다
  public BasicPayCalculator(int payRate) {
    //super();
    this.payRate = payRate;
  }
//	getPay(추상 메소드): 직원의 주급을 계산한 후 반환한다
  abstract public double getPay();

//	addHours: 직원의 평일 추가 근무시간을 넘겨 받아 평일 근무시간에 더한다
  public void addHours(int hours){
    this.hours += hours;
  }
//	setRate: 직원의 평일 시간당 임금을 주어진 값으로 변경한다
  public void setPayRate(int payRate) {
    this.payRate = payRate;
  }

//	setHours: 직원의 평일 근무시간을 주어진 값으로 변경한다\
  public void setHours(int hours) {
    this.hours = hours;
  }
}
