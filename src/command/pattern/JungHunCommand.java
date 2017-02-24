
package command.pattern;

/**
 * 정훈장교의 명령을 전달하는 역할
 * @author 지동
 */
public class JungHunCommand implements Command {
     JungHun jungHun;

    public JungHunCommand(JungHun jungHun) {
        this.jungHun = jungHun; 
    }

    public String execute() {   //정훈장교가 받은 명령들을 출력
        jungHun.jungHunEducation();
        jungHun.imageProduction();
        return jungHun.jungHunEducation() + "\n" + jungHun.imageProduction();
    }
}
