package decorator.pattern;

/**
 *추상클래스로 구현
 * 받은 상을 반환
 * @author 지동
 */
public abstract class Award {

         String description = "";

	public String getDescription() {    //장교,부사관,병사가 받은 상을 반환하는 함수
		return description;
	}
               public abstract String getAward();   //서브클래스에서 구현할 것

}