package day8.exam3;

public class Student extends Person{
//  private String name;
//  private int age;
  private String ssn;    // 학번

  Student(){
    super();
  }

  // 오버라이딩(overriding) : 재정의 
  //                        상속관계, 부모의 메소드 선언부와 동일(단, 접근제한자는 동일하거나 위가 더 커야한다)
  public void eat(){
    System.out.println("많이 먹다");
  }

  public void study(){
    System.out.println("공부하다");
  }
}
