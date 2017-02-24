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
public class SState implements State{//보급품 있음 상황
    SP sP;
    
    public SState(SP sP){
    this.sP=sP;
    }
    public String reQ(){
    String a ="보급 요청\n";
    return a;
    }
     public String reJ(){
    String b ="보급 요청 거부\n";
    return b;
    }
     public String id(){
    String c = "창고 확인\n";
    return c;
    }
    public String ds(){
    return sP.releaseS();
    }
    @Override
    public String toString(){
    return "보급품 전달\n";
    }
}
