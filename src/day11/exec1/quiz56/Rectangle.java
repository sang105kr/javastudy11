package day11.exec1.quiz56;

import java.lang.*;

public class Rectangle extends Object{
//  변수들
//	length: 가로
//	width: 세로
  private double length;
  private double width;

  public Rectangle() {
    super();
  }

//      메소드들
//	calculateArea: 면적을 계산한다
  public double calculateArea(){
    double result = 0.0;
    result = length * width;
    return result;
  }
//	calculatePerimeter: 둘레를 계산한다
  public double calculatePerimeter(){
    return (this.length + this.width) * 2.0;
  }

//	getLength: 가로의 길이를 반환한다
  public double getLength() {
    return length;
  }

//	setLength: 가로의 길이를 주어진 값으로 변경한다
  public void setLength(double length) {
    if (length <= 0) return;
    this.length = length;
  }

//	getWidth: 세로의 길이를 반환한다
  public double getWidth() {
    return width;
  }

//	setWidth: 세로의 길이를 주어진 값으로 변경한다
  public void setWidth(double width) {
    if (width <= 0) return;
    this.width = width;
  }
}
