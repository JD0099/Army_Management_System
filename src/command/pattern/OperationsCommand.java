
package command.pattern;

/**
 *���������� ����� �����ϴ� ����
 * @author ����
 */
public class OperationsCommand implements Command {
     Operations operations;

    public OperationsCommand(Operations operations) {
        this.operations = operations;
    }

    public String execute() {   //���������� ���� ��ɵ��� ���
        operations.readinessTraining();
        return operations.readinessTraining();
    }
}
