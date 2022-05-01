package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	/* Restaurant 객체는 Chef 타입의 객체를 소유
	 * @Setter : 자동으로 setChef()를 컴파일 시 생성
	 * @Setter에서 사용된 onMethod 속성은 생성되는 setChef()에
	 * @Autowired 어노테이션을 추가하도록 한다
	 * Outline 탭을 통해 클래스 정보 확인
	 */
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
