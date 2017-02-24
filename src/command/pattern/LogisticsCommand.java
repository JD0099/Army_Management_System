
package command.pattern;

/**
 * 군수과장의 명령을 전달하는 역할
 * @author 지동
 */
public class LogisticsCommand implements Command {
      Logistics logistics;

    public LogisticsCommand(Logistics logistics) {
        this.logistics = logistics;
    }

    public String execute() {   //군수과장이 받은 명령들을 출력
        logistics.logisticsManagement();
        return logistics.logisticsManagement();
    }
}
