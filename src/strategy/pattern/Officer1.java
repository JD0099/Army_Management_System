/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * �屳 �ް� Ŭ����
 * HolidayBehavior(�ް�) �������̽��� �޾� Officer1(�屳) Ŭ���� ����
 *  * @author ����
 */
 
public class Officer1 implements HolidayBehavior {
        public String holiday(){
        String holiday = "-----------�屳 �ް�-----------\n1�⿡ 21��! �ִ� 2�� 3��";
        return holiday;
    }
}

