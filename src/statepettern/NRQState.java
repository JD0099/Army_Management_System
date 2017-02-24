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
public class NRQState implements State {//보급 요청이 없음 상황
    SP sP;
    
    public NRQState(SP sP){
    this.sP = sP;
    }
    
    public String reQ(){
    String a = "보급 요청\n";
    sP.setState(sP.getHRQState());
    return a;
    }
    public String reJ(){
      String b = "보급 요청 거부\n";
      return b;
    }
    public String id(){
      String c = "창고 확인\n";
      return c;
    }
    public String ds(){
      String d = "보급 전달\n";
      return d;
    }
    @Override
    public String toString(){
    return "보급 요청을 기다려라.\n";
    }
}
