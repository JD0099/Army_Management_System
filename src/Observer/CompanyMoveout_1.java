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
   // 부대가 일정 인원 미만이면 전입인원 자동으로 알려줌
    // 부대가 일정 인원 이상이면 전입인원 자동으로 알려줌
    private float allmoveout_1=0; 
    public CompanyMoveout_1(Observable observable){
    observable.addObserver(this);
    }
    public void update(Observable observable,Object arg){
    if(observable instanceof OfficerCommander){
    OfficerCommander companyData = (OfficerCommander)observable;
    float moveout_1 =companyData.getMoveout_1();
    //옵저버로부터 바뀐 인원을 받는다
    allmoveout_1=moveout_1;//부대 추가 인원(전출인원 )값을 넘겨준다.
  
    display();
    
    }
    }
    public void display(){//부대 전출입 알고리즘
        if(allmoveout_1<60){
         System.out.println("1중대 전입 인원 발생--인원:"+ allmoveout_1);        
        }
    
         if(allmoveout_1>65){
         System.out.println("1중대 전출 인원 발생--인원:"+allmoveout_1);
         }
    }
}
