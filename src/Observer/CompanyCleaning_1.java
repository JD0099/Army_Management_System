/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author im
 */
public class CompanyCleaning_1 implements Observer,CommandDisplay {
private float getCleaning_1;
// �δ밡 ���� ��û�� �ο��� �Ѿ�� �ڵ����� �˷���
public CompanyCleaning_1(Observable observable)
{
observable.addObserver(this);
}
public void update(Observable observable,Object arg){
if(observable instanceof OfficerCommander){
OfficerCommander companyData =(OfficerCommander)observable;

getCleaning_1=companyData.getCleaning_1();//�������κ��� �ٲ� �ο��� �޴´�
display();

}
}
public void display(){//�δ� û�� �˰���
   
        if(getCleaning_1>=8){
         System.out.println("1�ߴ� û�� �ǽ�--�ο�:"+getCleaning_1);
        }
        if(getCleaning_1<8){
         System.out.println("1�ߴ� û�� �̽ǽ�--�ο�:"+getCleaning_1);
        }
    }
}