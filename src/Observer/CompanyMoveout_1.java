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
public class CompanyMoveout_1 implements Observer,CommandDisplay {
   // �δ밡 ���� �ο� �̸��̸� �����ο� �ڵ����� �˷���
    // �δ밡 ���� �ο� �̻��̸� �����ο� �ڵ����� �˷���
    private float allmoveout_1=0; 
    public CompanyMoveout_1(Observable observable){
    observable.addObserver(this);
    }
    public void update(Observable observable,Object arg){
    if(observable instanceof OfficerCommander){
    OfficerCommander companyData = (OfficerCommander)observable;
    float moveout_1 =companyData.getMoveout_1();
    //�������κ��� �ٲ� �ο��� �޴´�
    allmoveout_1=moveout_1;//�δ� �߰� �ο�(�����ο� )���� �Ѱ��ش�.
  
    display();
    
    }
    }
    public void display(){//�δ� ������ �˰���
        if(allmoveout_1<60){
         System.out.println("1�ߴ� ���� �ο� �߻�--�ο�:"+ allmoveout_1);        
        }
    
         if(allmoveout_1>65){
         System.out.println("1�ߴ� ���� �ο� �߻�--�ο�:"+allmoveout_1);
         }
    }
}
