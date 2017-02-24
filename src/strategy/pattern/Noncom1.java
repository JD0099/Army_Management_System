/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * 부사관 휴가 클래스
 * HolidayBehavior(휴가) 인터페이스를 받아 Noncom1(부사관) 클래스 생성
 *  * @author 동영
 */
public class Noncom1 implements HolidayBehavior {
        public String holiday(){
        String holiday = "-----------부사관 휴가-----------\n1년에 21일 [최대 3박 4일씩 끊어서]";
        return holiday;
    }
}
