package day7.exam9;
/*
  static : 인스턴스 생성 없이 사용할수 있는 멤버
           main()실행전에 method영역에 로딩된다.
 */
public class Car {

  //정적 필드
  static int uniqueNumber;  //차량고유번호

  //인스턴스 필드
   final int MAX_SPEED;
   int speed;

  Car(int speed) {
    MAX_SPEED = speed;
    uniqueNumber++;
  }

  public void upSpeed(){
    if(speed + 1 > MAX_SPEED) return;
//    System.out.println("가속하다");
    this.speed++;
  }

  public void downSpeed(){
    if( speed == 0) return;
//    System.out.println("감속하다");
    this.speed--;
  }
  
  public int getSpeed() {
    return speed;
  }

  public int getUniqueNumber() {
    return uniqueNumber;
  }
  
  public static void test(){
    System.out.println("정적메소드");
  }
}
