package myClass;

/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (2025957072 강서윤, 2023320022 편규빈)
 * @version (2026-10-04)
 */
public class Book extends DB_Element
{
    //Book의 속성
    private String author ; 
    private String bookID ; 
    private String publisher ; 
    private String title ; 
    private int year ; 

    /**
     * Book 클래스 생성자 
     * @param 저자, 책 등록번호, 출판사, 책 제목, 출판년도
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
     * @return    책의 등록번호 (BookID)
     */
    public String getID()
    {
        // 여기에 코드를 작성하세요.
        return bookID ; 
    }

    /**
     * toString() : 책 객체의 정보를 ~ 출력하는 메소드 
     *

     * @return    책 객체의 정보 
     */
    public String toString()
    {
        // 여기에 코드를 작성하세요
        return  "(" + bookID + ")" + " "+title + ", "+author+", " + publisher + ", " + year ; 
    }

}