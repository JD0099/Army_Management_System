
package command.pattern;

/**
 * 배열을 선언
 * 문자열을 배열에 저장
 * 문자열을 실행하는 역할
 * @author 지동
 */
public class  Commander{
    Command[] orderCommands;    //배열을 선언

    public Commander(){
        orderCommands = new Command[4];     //배열의 크기를 지정
    }
    public String setCommand(int slot,Command command) {
        orderCommands[slot] = command;      //배열에 문자열을 저장
        return null;
    }

    public String order(int slot) {
        orderCommands[slot].execute();      //execute함수를 호출
        return orderCommands[slot].execute();
    }
}
