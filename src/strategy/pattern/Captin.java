/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * ���� Ŭ���� ����
 * ������ ��� holidaybehavior(�ް�)�� �屳�� 1�� 21�� �ִ� 2�� 3���� �ް��� �����´�  
 * ������ ��� gooutbehavior(����)�� ������ �ϰ���(18:00)������ �����´�.  
 * �������� �Ӽ����� �ܹ��� ������ ����
 * @author ����
 */
public class Captin extends Army {
    public Captin(){ //������
        holidaybehavior = new Officer1();
        gooutbehavior = new Executive();
    }

 
    public String display(){
        String a = "����";
        return a;
    }
}
