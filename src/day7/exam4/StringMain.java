package day7.exam4;

import java.util.Arrays;

public class StringMain {
  public static void main(String[] args) {
    String str = new String("울산KH정보교육원");

    int cnt = str.length();
    System.out.println(cnt);

    char ch = str.charAt(1);
    System.out.println(ch);

    int position = str.indexOf("K");
    System.out.println(position);

    int position2 = str.indexOf("z");
    System.out.println(position2);

    int position3 = str.indexOf("K",5);
    System.out.println(position3);

    String str2 = str.concat("5층");
    System.out.println(str2);

    String s = String.valueOf(3.14);
    System.out.println(s);

    String str3 = new String("abcd");
    String s1 = str3.toUpperCase();
    System.out.println(s1);

    String s2 = str.replace("정보교육원", "학원");
    System.out.println(s2);

    String s3 = str.substring(4);
    System.out.println(s3);

    String s4 = str.substring(4,7);
    System.out.println(s4);

    String str4 = new String(" 울산-KH-정보교육원 ");
    String s5 = str4.trim();  // 양끝 공백제거
    System.out.println(s5);

    String[] s6 = str4.split("-");
    for (int i = 0; i < s6.length; i++) {
      System.out.println(s6[i]);
    }
    System.out.println(Arrays.toString(s6));
  }
}