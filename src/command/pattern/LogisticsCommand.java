
package command.pattern;

/**
 * ���������� ����� �����ϴ� ����
 * @author ����
 */
public class LogisticsCommand implements Command {
      Logistics logistics;

    public LogisticsCommand(Logistics logistics) {
        this.logistics = logistics;
    }

    public String execute() {   //���������� ���� ��ɵ��� ���
        logistics.logisticsManagement();
        return logistics.logisticsManagement();
    }
}
