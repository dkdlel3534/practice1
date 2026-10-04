import DataBase.LibDB ; 
import myClass.* ; 
import java.util.* ; 
/**
 * myApp  :  ㅇㅇㅇ 를 최종 실행시키는 main 
 *
 * @author (2025957072 강서윤)
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
    }
}