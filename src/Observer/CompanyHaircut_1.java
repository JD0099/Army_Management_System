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
    // 부대가 일정 미이발 인원이 넘어가면 자동으로 알려줌
    private float getHaircut_1;
    public CompanyHaircut_1(Observable observable){
    this.observable=observable;
    observable.addObserver(this);
    }
    public void update(Observable obs,Object arg){
    if(obs instanceof OfficerCommander){
    OfficerCommander companyData =(OfficerCommander)obs;
    
    this.getHaircut_1=companyData.getHaircut_1();
    //옵저버로부터 바뀐 인원을 받는다
    display();
    }
    }
    public void display(){//부대 이발 알고리즘
        if(getHaircut_1<8){
         System.out.println("1중대 이발 미실시--인원:"+ getHaircut_1);
        }
        if(getHaircut_1>=8){
         System.out.println("1중대 이발 실시--인원:"+ getHaircut_1);
        }
    }
}
