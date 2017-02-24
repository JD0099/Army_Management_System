/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * 장교 휴가 클래스
 * HolidayBehavior(휴가) 인터페이스를 받아 Officer1(장교) 클래스 생성
 *  * @author 동영
 */
 
public class Officer1 implements HolidayBehavior {
        public String holiday(){
        String holiday = "-----------장교 휴가-----------\n1년에 21일! 최대 2박 3일";
        return holiday;
    }
}

