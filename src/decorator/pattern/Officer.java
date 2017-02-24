package decorator.pattern;
/**
 * 장교가 받는 상과 상에 따라오는 포상휴가 구현
 * @author 지동
 */
public class Officer extends Award {

	public Officer() {  //장교가 받는 상과 포상휴가
		description = "장교 - 호국 훈련 우수 상, 4박 5일 포상휴가";
	}

	  public String getAward() {
                    String award = "";
		return award;
	}

}