package decorator.pattern;
/**
 * 병사가 받는 상과 상에 따라오는 포상휴가 구현
 * @author 지동
 */
public class Soldier extends Award {

	public Soldier() {  //병사가 받는 상과 포상휴가
		description = "병사 - 모범 상, 2박 3일 포상휴가";
	}

	  public String getAward() {
                    String award = "";
		return award;
	}
}