import DataBase.LibDB ; 
import myClass.* ; 
import java.util.* ; 
/**
 * myApp  :  ㅇㅇㅇ 를 최종 실행시키는 main 
 *
 * @author (2025957072 강서윤, 2023320022 편규빈)
 * @version (2026-10-04)
 */
public class myApp
{
    public static void main(String[] args) {
        // 1. 3개의 DB 생성 
        LibDB<Book> BookDB = new LibDB<Book> () ;  // 책 DB 생성 
        LibDB<User> UserDB = new LibDB<User> () ;  // 이용자 DB 생성 
        HashMap<String,String> LoanDB = new HashMap<String,String> () ; // 대출 DB 생성 

        // 2. 이용자 3명 생성 
        User user1 = new User(2025320001 , "Kim") ; 
        User user2 = new User(2024320002, "Lee") ; 
        User user3 = new User(2023320003, "Park") ; 

        //3. 이용자를 이용자DB에 등록
        UserDB.addElement(user1);
        UserDB.addElement(user2);
        UserDB.addElement(user3);

        //4. 이용자 목록 출력 
        System.out.println("----- 이용자 목록 출력 -----");
        printDB(UserDB);

    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static <T extends DB_Element> void printDB(LibDB <T> db)
    {
        db.printAllElements();
    }

}