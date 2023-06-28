package day14.exam3;
/*
  final + 클래스 : 개념 확장 불가
  final + 메서드 : 하위 개념에서 재정의 불가
  final + 필드(메소드 밖에 선언된변수)  : 재할당 불가
  final + 지역변수 : 재할당 불가  
  
  abstract + class : 미완성 클래스
    1. 인스턴스 생성불가
    2. 상위 타입으로 사용 가능
    3. 미완성 메소드가 1개라도 존재하면 미완성 클래스
    3. 미완성 메소드가 없다하더라도 abstract
  abstract + method : 미완성 메소드(구현부가 없고 선언부만 있는 메소드)
 */
 abstract public class Person {
   abstract public void smile();
}
