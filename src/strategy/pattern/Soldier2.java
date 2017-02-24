/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;


/**
 * 병사 외출 클래스
 * GooutBehavior(외출) 인터페이스를 받아 Executive(병사) 클래스 생성
 *  * @author 동영
 */
 
public class Soldier2 implements GooutBehavior {
        public String goout(){
        String go_out = "-----------병사 외출-----------\n병사는 특별한 사유 외에 외출을 할수 없음";
        return go_out;
    }
}
