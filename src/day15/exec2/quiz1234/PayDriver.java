package day15.exec2.quiz1234;

public class PayDriver {
  public static void main(String[] args) {

    OverPayCalculator	payout1 = null;   // OverPayCalculator 객체를 가리키는 참조 변수
    DangerPayCalculator	payout2 = null; //DangerPayCalculator 객체를 가리키는 참조 변수

//    1.	직원의 평일 시간당 임금이 8,000인 OverPayCalculator 객체를 생성하고 payout1이 가리키게 한다.
    payout1 = new OverPayCalculator(8000);
//    2.	payout1의 평일 근무시간에 50을 더한다.
    payout1.setHours(50);
//    3.	payout1의 토요일 근무 시간을 6으로 변경한다.
    payout1.setSatHours(6);
//    4.	payout1의 일요일 근무 시간을 2로 변경한다.
    payout1.setSunHours(2);
//    5.	‘주말 근무 직원의 주급: ‘을 출력한다.

//    6.	payout1의 주급을 계산하여 출력한다.
    System.out.println("주말 근무 직원의 주급 : " + payout1.getPay());
//    7.	직원의 평일 시간당 임금이 10,000인 DangerPayCalculator 객체를 생성하고 payout2가 가리키게 한다.
    payout2 = new DangerPayCalculator(10000);
//    8.	payout2의 평일 근무시간에 36을 더한다.
    payout2.addHours(36);
//    9.	payout2의 위험 근무 시간을 6으로 변경한다.
    payout2.setDangerHours(6);
//    10.	‘위험 근무 직원의 주급: ‘을 출력한다.

//    11.	Payout2의 주급을 계산하여 출력한다.
    System.out.println("위험 근부 직원의 주급 : " + payout2.getPay());

  }
}
