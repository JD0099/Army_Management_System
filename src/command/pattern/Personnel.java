
package command.pattern;

/**
 *인사과장이 하는 일(즉 명령을 전달 받는 것)
 * @author 지동
 */
public class Personnel{
    
    public String standDownManagement() {
       String a = "휴가 인원 관리 실시";    //String에 문자열을 저장
       return a;
    }
   public String recruitManagement() {
       String b = "전입 신병 관리 실시";    //String에 문자열을 저장
       return b;
    }
    public String disciplinaryActionManagement() {
       String c = "징계 처분 관리 실시";    //String에 문자열을 저장
       return c;
    }
}