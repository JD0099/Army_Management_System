
package command.pattern;

/**
 *작전과장의 명령을 전달하는 역할
 * @author 지동
 */
public class OperationsCommand implements Command {
     Operations operations;

    public OperationsCommand(Operations operations) {
        this.operations = operations;
    }

    public String execute() {   //작전과장이 받은 명령들을 출력
        operations.readinessTraining();
        return operations.readinessTraining();
    }
}
