package myClass;


/**
 * User 클래스 : 
 *
 * @author (2025320070 복창희, )
 * @version (2026-10-04)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User 클래스의 객체 생성자
     */
    public User()
    {
        // 인스턴스 변수 초기화
        x = 0;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String getID()
    {
        return Integer.toString(stID);
    }
}