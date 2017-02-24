package decorator.pattern;
/**
 *�߰��� �޴� ����(���) ����
 * @author ����
 */
public class PrizeMoney extends Condimentdecorator {

	 Award award;  //�߰��� �޴� ������ ������ �ν��Ͻ� ����
	public PrizeMoney(Award award) {    //�ν��Ͻ� ������ ���ΰ��� �ϴ� ��ü�� �����ϱ� ���� ������
		this.award = award;
	}

	public String getDescription() {
		return award.getDescription();
	}

	public String getAward() {  //�߰��� �޴� ���� �κ�
                                String gunshot_excellent_award = "--�߰� ����--\n100,000��\n";
		return award.getAward() + gunshot_excellent_award;
	}

}