/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * ���� Ŭ���� ����
 * ������ ��� holidaybehavior(�ް�)�� ������ ���� ��(637��/21��)�ް�(��)�� �����´�  
 * ������ ��� gooutbehavior(����)�� ������ Soldier (��)�� ���� ����Ұ� ������ �����´�.  
 * @author ����
 */
public class Sergeant extends Army {  
    public Sergeant(){ //������
        holidaybehavior = new Soldier1();
        gooutbehavior = new Soldier2();
    }

 
    public String display(){
        String a = "����";
        return a;
    }
}
