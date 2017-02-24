/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * 간부 외출 클래스
 * GooutBehavior(외출) 인터페이스를 받아 Executive(간부) 클래스 생성
 * * @author 동영
 */
public class Executive  implements GooutBehavior {
        public String goout(){
        String go_out = "-----------간부 외출-----------\n평일 18시 이후 출타가능";
        return go_out;
    }
}