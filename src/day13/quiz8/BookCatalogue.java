package day13.quiz8;

import java.util.Arrays;

public class BookCatalogue {
  private Book[] catalogue;              // Book 객체들의 배열
  private final int CAPACITY = 10;       // 도서목록의 최대 크기
  private int bookCount;                 // 도서목록에 있는 책들의 총수

//생성자메소드: 크기가 10인 비어 있는 도서목록을 만든다

  public BookCatalogue() {
    catalogue = new Book[CAPACITY];
  }

//addToCatalogue: 도서목록에 한 Book 객체를 추가한다
  public void addToCatalogue(String bookName,String bookAuthor,int bookPrice) {
    Book book = new Book(bookName, bookAuthor, bookPrice);
    catalogue[bookCount++] = book;
//    bookCount++;
  }

  public void addToCatalogue(Book book) {
    catalogue[bookCount++] = book;
//    bookCount++;
  }

//toString: 도서목록의 상태를 문자열로 반환한다
  @Override
  public String toString() {
    return "BookCatalogue{" +
        "catalogue=" + Arrays.toString(catalogue) +
        ", capacity=" + CAPACITY +
        ", bookCount=" + bookCount +
        '}';
  }
}
