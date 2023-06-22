package day11.exec1.quiz8;

public class Time {
//  변수들
//	hour: 시
//	minute: 분
//	second: 초
  private int hour;
  private int minute;
  private int second;
//
//      메소드들

//	getHour: 시를 반환한다
  public int getHour() {
    return hour;
  }

//	setHour: 시를 주어진 값으로 변경한다
  public void setHour(int hour) {
    if(this.hour+hour < 0 || this.hour+hour > 24) return;
    this.hour = hour;
  }

//	getMinute: 분을 반환한다
  public int getMinute() {
    return minute;
  }

//	setMinute: 분을 주어진 값으로 변경한다
  public void setMinute(int minute) {
    if(this.minute+minute < 0 || this.minute+minute > 60) return;
    this.minute = minute;
  }

//	getSecond: 초를 반환한다
  public int getSecond() {
    return second;
  }

//	setSecond: 초를 주어진 값으로 변경한다
  public void setSecond(int second) {
    //if(!(second >= 0 && second <= 60)) return;
    if(this.second+second < 0 || this.second+second > 60) return;
    this.second = second;
  }


  //	adjustHour: 시를 주어진 양만큼 조정한다
  public void adjustHour(int hour) {
    this.hour += hour;
  }

  //	adjustMinute: 분을 주어진 양만큼 조정한다
  public void adjustMinute(int minute) {
    this.minute += minute;
  }

  //	adjustSecond: 초를 주어진 양만큼 조정한다
  public void adjustSecond(int second) {
    this.second += second;
  }

//	printTime: 현재 시간을 출력한다
  public void printTime(){
    System.out.printf("현재시간 => %d : %d : %d\n", hour,minute,second  );
    System.out.printf("현재시간 => %d : %d : %d\n", getHour(),getMinute(),getSecond() );
  }

  @Override
  public String toString() {
    return "Time{" +
        "hour=" + hour +
        ", minute=" + minute +
        ", second=" + second +
        '}';
  }
}
