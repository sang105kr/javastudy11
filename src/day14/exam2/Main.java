package day14.exam2;

public class Main {
  public static void main(String[] args) {
     Item item = new Item();
     Item item1 = new TV();
     Item item2 = new SmartPhone();

//     item.on();
//     item1.on();
//     item2.on();

//    on(new Item());
//    on(new TV());
//    on(new SmartPhone());

     on(item);
    on(item1);
    on(item2);

    byte a = 1;
    short b = 2;
    char c = 'a';
    int d = 3;
    method1(a);
    method1(b);
    method1(c);
    method1(d);
  }


  private static void on(Item item) {
    item.on();
  }


  private static void method1(long value) {

  }
}
