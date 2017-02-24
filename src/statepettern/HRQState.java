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
public class HRQState implements State {//보급 요청이 있음 상황
SP sP;

public HRQState(SP sP){
this.sP=sP;
}
public String reQ(){
    String a = "보급 요청\n";
    return a;
}
public String reJ(){
    String b ="보급 요청 거부\n";
sP.setState(sP.getNRQState());
    return b;
}
public String id(){
    String c = "창고확인\n";
    return c;
}
public String ds(){
    String d = "보급품 전달\n";
    return d;
}

public String toString(){
    return "창고 수량을 확인 하라\n";
}
}
