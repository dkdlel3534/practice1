package myClass;
/**
 * Book 클래스 : 책 객체의 생성과 사용을 위한 클래스
 *
 * @author (2025957072 강서윤, 2023320022 편규빈)
 * @version (2026-10-04)
 */
public class Book extends DB_Element
{
    // 책의 속성
    private String author ; 
    private String bookID ; 
    private String publisher ; 
    private String title ; 
    private int year ; 

    /**
     * Book  클래스 생성자 
     * @param  저자(author), 책 등록번호(bookID), 출판사(publisher), 책 제목(title), 출판년도(year)
     * 
     */
    public Book(String author , String bookID , String publisher , String title , int year)
    {
        this.author = author ; 
        this.bookID = bookID ; 
        this.publisher = publisher ; 
        this.title = title ; 
        this.year = year ; 
    }

    /**
     * getID() : 책의 등록번호를 반환하는 메소드 
     *
     * @return    책의 등록번호 (bookID)
     */
    public String getID()
    {
        return bookID ; 
    }

    /**
     * toString() : 책 객체의 정보를 실행결과 화면처럼 출력하는 메소드  
     *
     * @return    책 객체의 정보 
     */
    public String toString()  // Object 클래스의 toString()을 오버라이딩함 ! 
    {
        return  "(" + bookID + ")" + " "+title + ", "+author+", " + publisher + ", " + year ; 
    }

}