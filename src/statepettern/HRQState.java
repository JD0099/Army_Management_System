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
public class HRQState implements State {//���� ��û�� ���� ��Ȳ
SP sP;

public HRQState(SP sP){
this.sP=sP;
}
public String reQ(){
    String a = "���� ��û\n";
    return a;
}
public String reJ(){
    String b ="���� ��û �ź�\n";
sP.setState(sP.getNRQState());
    return b;
}
public String id(){
    String c = "â��Ȯ��\n";
    return c;
}
public String ds(){
    String d = "����ǰ ����\n";
    return d;
}

public String toString(){
    return "â�� ������ Ȯ�� �϶�\n";
}
}
