package decorator.pattern;
/**
 *�߰��� �޴� ����(�ܹ�) ����
 * @author ����
 */
public class SleepOut extends Condimentdecorator {

                Award award;    //�߰��� �޴� ������ ������ �ν��Ͻ� ����
	public SleepOut(Award award) {  //�ν��Ͻ� ������ ���ΰ��� �ϴ� ��ü�� �����ϱ� ���� ������
		this.award = award;
	}

	public String getDescription() {
		return award.getDescription();
	}

	public String getAward() {  //�߰��� �޴� ���� �κ�
                                String gunshot_excellent_award = "--�߰� ����--\n�ܹ�\n";
		return award.getAward() + gunshot_excellent_award;
	}
}