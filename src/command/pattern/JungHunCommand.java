
package command.pattern;

/**
 * �����屳�� ����� �����ϴ� ����
 * @author ����
 */
public class JungHunCommand implements Command {
     JungHun jungHun;

    public JungHunCommand(JungHun jungHun) {
        this.jungHun = jungHun; 
    }

    public String execute() {   //�����屳�� ���� ��ɵ��� ���
        jungHun.jungHunEducation();
        jungHun.imageProduction();
        return jungHun.jungHunEducation() + "\n" + jungHun.imageProduction();
    }
}
