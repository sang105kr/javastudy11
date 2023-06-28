package day15.quiz2345;
/*
  접근제한자 : 
    1.private : 동일클래스 내
    2.default : 동일클래스 내 + 동일패키지
    3.protected : 동일클래스 내 + 동일패키지 + 다른패키지:상속관계일경우만
    4.public : 모든범위(동일클래스 내 + 동일패키지 + 다른패키지)
 */
public class Point {

  protected int	x_coordinate;    // 점의 x 좌표
  protected int y_coordinate;    // 점의 y 좌표


//	생성자메소드: Point 객체를 기본 값(x_coordinate = y_coordinate = 0)으로 초기화한다
  public Point() {
//    super();
  }
//	생성자메소드: Point 객체를 특정 x 좌표 값과 특정 y 좌표 값으로 초기화한다
  public Point(int x_coordinate, int y_coordinate) {
//    super();
    this.x_coordinate = x_coordinate;
    this.y_coordinate = y_coordinate;
  }

//	getX: 현 Point 객체의 x 좌표를 반환한다
  public int getX_coordinate() {
    return x_coordinate;
  }
//	getY: 현 Point 객체의 y 좌표를 반환한다
  public int getY_coordinate() {
    return y_coordinate;
  }
//	setX: 현 Point 객체의 x 좌표를 주어진 값으로 변경한다
  public void setX_coordinate(int x_coordinate) {
    this.x_coordinate = x_coordinate;
  }
//	setY: 현 Point 객체의 y 좌표를 주어진 값으로 변경한다
  public void setY_coordinate(int y_coordinate) {
    this.y_coordinate = y_coordinate;
  }

//	printPoint: 현 Point 객체의 좌표 = [x, y]의 형태로 출력한다
  public void printPoint(){
    System.out.printf("[%d,%d]\n",x_coordinate,y_coordinate);
  }
}
