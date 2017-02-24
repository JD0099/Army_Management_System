
package command.pattern;

/**
 *인사과장의 명령을 전달하는 역할
 * @author 지동
 */
public class PersonnelCommand implements Command {
    Personnel personnel;

    public PersonnelCommand(Personnel personnel) {
        this.personnel = personnel;
    }

    @Override
    public String execute() {   //인사과장이 받은 명령들을 출력
        personnel.standDownManagement();
        personnel.recruitManagement();
        personnel.disciplinaryActionManagement();
        return personnel.standDownManagement() + "\n" + personnel.recruitManagement() + "\n" + personnel.disciplinaryActionManagement();
    }
}