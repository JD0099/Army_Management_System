package decorator.pattern;
/**
 *�߰��� �޴� ����(�ް�) ����
 * @author ����
 */
public class StandDown extends Condimentdecorator {

	Award award;    //�߰��� �޴� ������ ������ �ν��Ͻ� ����

	public StandDown(Award award) { //�ν��Ͻ� ������ ���ΰ��� �ϴ� ��ü�� �����ϱ� ���� ������
		this.award = award;
	}

	public String getDescription() {
		return award.getDescription();
	}

	public String getAward() {  //�߰��� �޴� ���� �κ�
                                String gunshot_excellent_award = "--�߰� ����--\n1�� 2��\n";
		return award.getAward() + gunshot_excellent_award;
	}
}