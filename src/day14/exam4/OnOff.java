package day14.exam4;
/*
  interface :
    1. 상수(static final)와, 추상메소드를 멤버로 갖는다.(default,static)
    2. 인스턴스 생성 불가
    3. 모든 멤버가 public (public 키워드를 생략하더라도 public)
 */
public interface OnOff {
  //public abstract void on();
  void on(); //public abstract 생략 가능
}
