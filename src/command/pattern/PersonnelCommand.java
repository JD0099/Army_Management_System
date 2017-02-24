
package command.pattern;

/**
 *�λ������ ����� �����ϴ� ����
 * @author ����
 */
public class PersonnelCommand implements Command {
    Personnel personnel;

    public PersonnelCommand(Personnel personnel) {
        this.personnel = personnel;
    }

    @Override
    public String execute() {   //�λ������ ���� ��ɵ��� ���
        personnel.standDownManagement();
        personnel.recruitManagement();
        personnel.disciplinaryActionManagement();
        return personnel.standDownManagement() + "\n" + personnel.recruitManagement() + "\n" + personnel.disciplinaryActionManagement();
    }
}