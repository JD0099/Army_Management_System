/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * ���� �ް� Ŭ����
 * HolidayBehavior(�ް�) �������̽��� �޾� Soldier1(����) Ŭ���� ����
 *  * @author ����
 */
public class Soldier1 implements HolidayBehavior {
        public String holiday(){
        String holiday = "-----------���� �ް�-----------\n����Ȱ �� 21��[637�� ��]";
        return holiday;
    }
}

