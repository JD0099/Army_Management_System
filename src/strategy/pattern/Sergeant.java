/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * 병장 클래스 구현
 * 병장의 경우 holidaybehavior(휴가)의 병사의 복무 중(637일/21일)휴가(값)를 가져온다  
 * 병장의 경우 gooutbehavior(외출)의 병사의 Soldier (값)인 병사 외출불가 값을ㄹ 가져온다.  
 * @author 동영
 */
public class Sergeant extends Army {  
    public Sergeant(){ //생성자
        holidaybehavior = new Soldier1();
        gooutbehavior = new Soldier2();
    }

 
    public String display(){
        String a = "병장";
        return a;
    }
}
