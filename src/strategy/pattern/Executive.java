/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * ���� ���� Ŭ����
 * GooutBehavior(����) �������̽��� �޾� Executive(����) Ŭ���� ����
 * * @author ����
 */
public class Executive  implements GooutBehavior {
        public String goout(){
        String go_out = "-----------���� ����-----------\n���� 18�� ���� ��Ÿ����";
        return go_out;
    }
}