/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * �߻�Ŭ���� ����
 * ������ �������� �Ӽ��� �ܹ��� ������ ����
 * @author ����
 */
 
public abstract class Army {
    protected GooutBehavior gooutbehavior;
    protected HolidayBehavior holidaybehavior;
    public String sleepout(){    //���� �Ӽ��� �ܹ� 
        String sleep_out = "������ �ָ��� �ܹ��� �Ҽ�����"; 
        return sleep_out;
}    
public abstract String display();

public String performHoliday(){
        holidaybehavior.holiday();
        return holidaybehavior.holiday();
}
public String performGoout(){
    gooutbehavior.goout();
    return gooutbehavior.goout();
}

public void setHolidayBehavior(HolidayBehavior hb){
    holidaybehavior =hb; //�θ� Ŭ���� (�ް�)
}
public void setGooutBehavior(GooutBehavior gb){
    gooutbehavior =gb;//�θ� Ŭ���� (����) 
}


}