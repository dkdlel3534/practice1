package DataBase;
import java.util.* ; 
import myClass.* ; 
/**
 * LibDB<T> 클래스 : 책 DB와 이용자 DB를 만들어내는 제네릭 클래스 
 *
 * @author (2025957072 강서윤, 2025320070 복창희)
 * @version (2026-10-04)
 */
public class LibDB<T extends DB_Element>
{
    private ArrayList<T> db = new ArrayList<T> () ; 

    /**
     * LibDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        ArrayList<T> db = new ArrayList<T> () ; 
    }

    /**
     * addElement() : DB에 요소(객체)를 추가하는 메소드 
     *
     * @param     추가할 요소 객체 T
     * @return    void
     */

    ///  이 부분 제네릭 메소드인가 ? 
    public void addElement(T element)
    {
        db.add(element) ; 
    }

    /**
     * findElement() : ID를 이용하여 DB내 해당 객체를 검색하는 메소드 
     *
     * @param   ID 값 (책의 등록 번호 or 이용자 학번)
     * @return  DB 내 객체 반환 (T)
     */
    // 얘도 제네릭 메소드 ? 
    public T findElement(String ID)
    {
        Iterator<T> it = db.iterator() ; 

        T object = null ; 
        while(it.hasNext()) {
            object = it.next()  ;  // DB 내 객체를 의미 (책 or 이용자)

            // 만일 파라미터의 ID가 객체의 ID와 일치한다면 break , 그리고 해당 객체를 반환 
            if (ID == object.getID()) {
                break ; 

            }
        }
        return object ; 
    }

    /**
     * printAllElement() : DB의 객체의 내용을 전부 출력한다
     */
    public void printAllElements()
    {
        for (T object : db){
            System.out.println(object.toString());
        }
    }

}