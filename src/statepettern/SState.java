/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepettern;

/**
 *
 * @author im
 */
public class SState implements State{//����ǰ ���� ��Ȳ
    SP sP;
    
    public SState(SP sP){
    this.sP=sP;
    }
    public String reQ(){
    String a ="���� ��û\n";
    return a;
    }
     public String reJ(){
    String b ="���� ��û �ź�\n";
    return b;
    }
     public String id(){
    String c = "â�� Ȯ��\n";
    return c;
    }
    public String ds(){
    return sP.releaseS();
    }
    @Override
    public String toString(){
    return "����ǰ ����\n";
    }
}
