package day6.exam2;

public class Car {
  
  int speed;      //현재 속도

  //Car(){  }

  // 달린다
  public void run(){
    System.out.println("달린다");
  }
  
  // 가속
  public void upSpeed(){
    this.speed++;
  }
  // 감속
  public void downSpeed(){
    this.speed--;
  }

  // 멈춘다
  public void stop(){
    System.out.println("멈춘다");
  }
}
