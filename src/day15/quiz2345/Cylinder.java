package day15.quiz2345;

public class Cylinder extends Circle {

  private int height;       // 원기둥의 높이

//	생성자메소드: Cylinder 객체를 기본 값(x_coordinate = y_coordinate = radius = height= 0)으로 초기화한다
  public Cylinder(){
    //super();
  }
//	생성자메소드: Cylinder 객체를 아래 원을 주어진 중심의 x 좌표 값과 y 좌표 값과 특정 반지름 값으로 초기화하고 원기둥의 높이를 주어진 값으로 초기화한다
  public Cylinder(int x_coordinate, int y_coordinate, int radius, int height){
    super(x_coordinate, y_coordinate, radius);
    this.height = height;
  }
//	getHeight: 원기둥의 높이를 반환한다
  public int getHeight() {
    return height;
  }
//	calculateSurfaceArea: 원기둥의 표면적을 계산한다 ((원의 둘레 * 높이) + (원의넓이 * 2))
  public double calculateSurfaceArea(){
    return ((2 * Math.PI * getRadius() * height) + (getArea() * 2));
  }
//	calculateVolume: 원기둥의 부피를 계산한다 (원의 넓이 * 높이)
  public double calculateVolume(){
    return getArea() * height;
  }

//	printCylinder: 원기둥의 현 상태를 출력한다
  public void printCylinder(){
//    System.out.println("좌표 : ");
//    printPoint();
//    System.out.println("반지름 : " + getRadius());
    super.printCircle();
    System.out.println("높이 : " + getHeight());
  }
}
