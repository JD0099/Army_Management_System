/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * 추상클래스 구현
 * 군인의 공통적인 속성이 외박을 각지고 있음
 * @author 동영
 */
 
public abstract class Army {
    protected GooutBehavior gooutbehavior;
    protected HolidayBehavior holidaybehavior;
    public String sleepout(){    //공통 속성인 외박 
        String sleep_out = "군인은 주말에 외박을 할수있음"; 
        return sleep_out;
}    
public abstract String display();

public String performHoliday(){
        holidaybehavior.holiday();
        return holidaybehavior.holiday();
}
public String performGoout(){
    gooutbehavior.goout();
    return gooutbehavior.goout();
}

public void setHolidayBehavior(HolidayBehavior hb){
    holidaybehavior =hb; //부모 클래스 (휴가)
}
public void setGooutBehavior(GooutBehavior gb){
    gooutbehavior =gb;//부모 클래스 (외출) 
}


}