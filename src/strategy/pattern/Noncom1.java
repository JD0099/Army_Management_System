/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * �λ�� �ް� Ŭ����
 * HolidayBehavior(�ް�) �������̽��� �޾� Noncom1(�λ��) Ŭ���� ����
 *  * @author ����
 */
public class Noncom1 implements HolidayBehavior {
        public String holiday(){
        String holiday = "-----------�λ�� �ް�-----------\n1�⿡ 21�� [�ִ� 3�� 4�Ͼ� ���]";
        return holiday;
    }
}
