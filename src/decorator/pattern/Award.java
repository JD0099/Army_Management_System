package decorator.pattern;

/**
 *�߻�Ŭ������ ����
 * ���� ���� ��ȯ
 * @author ����
 */
public abstract class Award {

         String description = "";

	public String getDescription() {    //�屳,�λ��,���簡 ���� ���� ��ȯ�ϴ� �Լ�
		return description;
	}
               public abstract String getAward();   //����Ŭ�������� ������ ��

}