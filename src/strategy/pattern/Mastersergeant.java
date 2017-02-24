/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * 상사 클래스 구현
 * 상사의 경우 holidaybehavior(휴가)의 상사의 1년 21일 최대 3박 4일의 휴가(값)를 가져온다  
 * 상사의 경우 gooutbehavior(외출)의 간부의 일과후(18:00)시행(값)을 가져온다.  
 * 공통적인 속성으로 외박을 가지고 있음
 * @author 동영
 */
public class Mastersergeant extends Army{
    public Mastersergeant(){ //생성자
        holidaybehavior = new Noncom1();
        gooutbehavior = new Executive();
    }

 
    public String display(){
        String a = "상사";
        return a;
    }
}
