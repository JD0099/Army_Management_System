/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * 대위 클래스 구현
 * 대위의 경우 holidaybehavior(휴가)의 장교의 1년 21일 최대 2박 3일의 휴가를 가져온다  
 * 대위의 경우 gooutbehavior(외출)의 간부의 일과후(18:00)시행을 가져온다.  
 * 공통적인 속성으로 외박을 가지고 있음
 * @author 동영
 */
public class Captin extends Army {
    public Captin(){ //생성자
        holidaybehavior = new Officer1();
        gooutbehavior = new Executive();
    }

 
    public String display(){
        String a = "대위";
        return a;
    }
}
