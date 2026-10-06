import myClass.* ; 
import DataBase.LibDB ; 
import java.util.* ; 
/**
 * myApp  : 대출 처리를 최종 실행시키는 main 
 *
 * @author (2025957072 강서윤, 2023320022 편규빈, 2025320070 복창희)
 * @version (2026-10-04)
 */
public class myApp
{
    public static void main(String[] args) {
        // 1. 3개의 DB 생성 
        LibDB<Book> bookDB = new LibDB<Book> () ;  // 책 DB 생성 
        LibDB<User> userDB = new LibDB<User> () ;  // 이용자 DB 생성 
        HashMap<User, Book> loanDB = new HashMap <User, Book > () ; // 대출 DB 생성 

        // 2. 이용자 3명 생성 
        User user1 = new User(2025320001 , "Kim") ; 
        User user2 = new User(2024320002, "Lee") ; 
        User user3 = new User(2023320003, "Park") ; 

        //3. 이용자를 이용자DB에 등록
        userDB.addElement(user1);
        userDB.addElement(user2);
        userDB.addElement(user3);

        //4. 이용자 목록 출력 
        System.out.println("----- 이용자 목록 출력 -----");
        printDB(userDB);
        System.out.println();

        //5. 책 4권 생성
        Book book1 = new Book("홍길동", "B01", "ABC", "Java Programming", 2000);
        Book book2 = new Book("profsHwang", "B02", "SMU", "Software Analysis and Design", 2023);
        Book book3 = new Book("황기태", "B03", "생능출판", "명품 자바프로그래밍", 2025);
        Book book4 = new Book("profsHwang", "B04", "SMU", "소프트웨어테스트", 2024);

        //6. 책 4권을 책DB에 등록
        bookDB.addElement(book1);
        bookDB.addElement(book2);
        bookDB.addElement(book3);
        bookDB.addElement(book4);

        //7. 책 목록 출력
        System.out.println("----- 책 목록 출력 -----");
        printDB(bookDB);
        System.out.println();

        //8. 대출작업 3건 수행
        loanDB.put(userDB.findElement(user1.getID()), bookDB.findElement(book2.getID())); 
        loanDB.put(userDB.findElement(user2.getID()), bookDB.findElement(book3.getID()));
        loanDB.put(userDB.findElement(user3.getID()), bookDB.findElement(book4.getID()));

        
        // 9. 대출 현황 출력
        System.out.println("----- 대출 현황 출력 -----") ;
        printLoanList(loanDB) ;
    }
    
    /**
     * printDB() : 책 DB 또는 이용자 DB의 모든 요소를 출력하는 메소드 
     *
     * @param    db(책 DB or 이용자 DB)
     */
    public static <T extends DB_Element> void printDB(LibDB <T> db)
    {
        db.printAllElements();
    }

    /**
     * printLoanList() : 대출 현황을 전부 출력하는 메소드 
     *
     * @param    대출 DB
     * @return   void
     * 
     */
    public static void printLoanList(HashMap<User,Book> loanDB)
    {
        Set<User> keySet = loanDB.keySet() ;  // 모든 key 목록 가져오기 
        Iterator<User> it = keySet.iterator() ; // key 목록 순회를 위한 Iterator() 실행 !
    
        while (it.hasNext()) {
            User user = it.next() ;  // User 객체 가져오기 
            Book book = loanDB.get(user) ;  // Book 객체 가져오기 
            
            // 대출 현황 출력 (이용자 정보 => 책 정보)
            System.out.println(user.toString()+" ===> "+book.toString()) ; 
        }
    }
}