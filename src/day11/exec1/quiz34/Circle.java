package day11.exec1.quiz34;

import java.lang.*;

public class Circle extends Object{
//  변수
//	radius: 원의 반지름
  private double radius;

  Circle(){
    super(); // 상위클래스의 생성자호출
  }

//
//  메소드들
//	computeArea: 원의 면적을 계산한다
  public double computeArea(){
    return radius * radius * Math.PI;
  }
//	computePerimeter: 원의 둘레를 계산한다
  public double comoputePerimeter(){
    return 2 * radius * Math.PI;
  }
//	getRadius: 원의 반지름을 반환한다
  public double getRadius(){
    return radius;
  }

  //	setRadius: 원의 반지름을 주어진 값으로 변경한다
  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        '}';
  }
}
