/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * ��� Ŭ���� ����
 * ����� ��� holidaybehavior(�ް�)�� ����� 1�� 21�� �ִ� 3�� 4���� �ް�(��)�� �����´�  
 * ����� ��� gooutbehavior(����)�� ������ �ϰ���(18:00)����(��)�� �����´�.  
 * �������� �Ӽ����� �ܹ��� ������ ����
 * @author ����
 */
public class Mastersergeant extends Army{
    public Mastersergeant(){ //������
        holidaybehavior = new Noncom1();
        gooutbehavior = new Executive();
    }

 
    public String display(){
        String a = "���";
        return a;
    }
}
