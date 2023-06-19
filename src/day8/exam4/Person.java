package day8.exam4;

// java.lang 패키지에 포함된 모든 클래스를 가져다 사용하겠다.
import java.lang.*;

// 모든 클래스의 최상위 부모는 Object
public class Person extends Object{

  // 기본생성 : 개발자가 생성자를 하나라도 정의하지 않으면 컴파일러가 자동 생성한다.
  Person(){
    super(); // 부모클래스의 기본 생성자 호출
  }
}
