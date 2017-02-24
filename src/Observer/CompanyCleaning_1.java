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
// 부대가 일정 미청소 인원이 넘어가면 자동으로 알려줌
public CompanyCleaning_1(Observable observable)
{
observable.addObserver(this);
}
public void update(Observable observable,Object arg){
if(observable instanceof OfficerCommander){
OfficerCommander companyData =(OfficerCommander)observable;

getCleaning_1=companyData.getCleaning_1();//옵저버로부터 바뀐 인원을 받는다
display();

}
}
public void display(){//부대 청소 알고리즘
   
        if(getCleaning_1>=8){
         System.out.println("1중대 청소 실시--인원:"+getCleaning_1);
        }
        if(getCleaning_1<8){
         System.out.println("1중대 청소 미실시--인원:"+getCleaning_1);
        }
    }
}