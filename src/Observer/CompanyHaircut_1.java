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
public class CompanyHaircut_1 implements Observer,CommandDisplay {
    Observable observable; 
    // �δ밡 ���� ���̹� �ο��� �Ѿ�� �ڵ����� �˷���
    private float getHaircut_1;
    public CompanyHaircut_1(Observable observable){
    this.observable=observable;
    observable.addObserver(this);
    }
    public void update(Observable obs,Object arg){
    if(obs instanceof OfficerCommander){
    OfficerCommander companyData =(OfficerCommander)obs;
    
    this.getHaircut_1=companyData.getHaircut_1();
    //�������κ��� �ٲ� �ο��� �޴´�
    display();
    }
    }
    public void display(){//�δ� �̹� �˰���
        if(getHaircut_1<8){
         System.out.println("1�ߴ� �̹� �̽ǽ�--�ο�:"+ getHaircut_1);
        }
        if(getHaircut_1>=8){
         System.out.println("1�ߴ� �̹� �ǽ�--�ο�:"+ getHaircut_1);
        }
    }
}
