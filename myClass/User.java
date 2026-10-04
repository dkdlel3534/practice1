package myClass;

/**
 * User 클래스 : 이용자 객체를 생성하는 클래스 
 *
 * @author (2025320070 복창희,2023320022 편규빈 )
 * @version (2026-10-04)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User 클래스 생성자
     *
     * @param  stID , name
    
     */
    public User(int stID,String name)
    {
        this.stID = stID ;
        this.name = name ;
    }

    /**
     * getID 메소드 -  이용자의 학번을 반환하는 매소드
     *
     * 
     * @return   stID
     */
    public String getID()
    {
        return Integer.toString(stID);
    }

    /**
     * toString 메소드 - 학번과 이름을 출력하는 메소드
     *
     * 
     * @return   학번과 이름
     */
    public String toString()
    {
        return "[" +stID+ "]"+ " "+ name ;    }

}