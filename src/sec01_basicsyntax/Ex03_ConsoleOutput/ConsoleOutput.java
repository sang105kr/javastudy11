package sec01_basicsyntax.Ex03_ConsoleOutput;

public class ConsoleOutput {
  public static void main(String[] args) {
    // 1. System.outprintln()
    System.out.println("안녕하세요");
    System.out.println("안녕" + "하세요");

    System.out.println("홍길동1");
    System.out.println("홍길동2");
    System.out.println();
    System.out.print("홍길순1");
    System.out.print("홍길순2");
    System.out.printf("");

    System.out.printf("%f",3.2582);
    System.out.printf("%4.2f",3.2582); //3.26

    System.out.println();
    System.out.println(1 + 2 + "홍길동");
    System.out.println("홍길동" + 1 + 2);
    System.out.println("홍길동" + (1 + 2));
  }
}
