
package command.pattern;

/**
 * �迭�� ����
 * ���ڿ��� �迭�� ����
 * ���ڿ��� �����ϴ� ����
 * @author ����
 */
public class  Commander{
    Command[] orderCommands;    //�迭�� ����

    public Commander(){
        orderCommands = new Command[4];     //�迭�� ũ�⸦ ����
    }
    public String setCommand(int slot,Command command) {
        orderCommands[slot] = command;      //�迭�� ���ڿ��� ����
        return null;
    }

    public String order(int slot) {
        orderCommands[slot].execute();      //execute�Լ��� ȣ��
        return orderCommands[slot].execute();
    }
}
