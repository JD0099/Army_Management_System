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
public class OfficerCommander extends Observable{ //�ߴ뿡 ����� �䱸�ϴ� �屳
    private int moveout_1//1�ߴ� �ο�
            ,haircut_1//1�ߴ� �̹��ο�
            ,cleaning_1;//1�ߴ� û���ο�
    public OfficerCommander(){}
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(int moveout_1,int haircut_1,int cleaning_1){
    this.moveout_1=moveout_1; 
    this.haircut_1=haircut_1;
    this.cleaning_1=cleaning_1; 
    measurementsChanged();
    }
 
    public float getMoveout_1(){
        return moveout_1;
    }
    public float getHaircut_1(){
        return haircut_1;
    }
    public float getCleaning_1(){
        return cleaning_1;
    }  
}