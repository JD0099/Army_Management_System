package decorator.pattern;
/**
 * 부사관이 받는 상과 상에 따라오는 포상휴가 구현
 * @author 지동
 */
public class Noncom extends Award {

	public Noncom() {   //부사관이 받는 상과 포상휴가
		description = "부사관 - 사격 우수 상, 3박 4일 포상휴가";
	}

                public String getAward() {  
                    String award = "";
		return award;
	}
}