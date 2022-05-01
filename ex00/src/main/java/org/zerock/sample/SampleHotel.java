package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/*
 * @Component
 * @ToString
 * @Getter 
 * public class SampleHotel {
 * 		
 * 		private Chef chef;
 * 		public SampleHotel(Chef chef) {
 * 			this.chef = chef; 
 * 		} 
 * }
 */
/* @AllArgsConstructor
 * 인스턴스 변수로 선언된 모든 것을 파라미터로 받는
 * 생성자를 작성
 * 만일 여러 개의 인스턴스 변수들 중에서 특정한 변수에 
 * 대해서만 생성자를 작성하고 싶다면  
 * @NonNull과 @RequiredArgsConstructor 어노테이션 이용
 */
@Component
@ToString
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class SampleHotel {
	
	@NonNull
	private Chef chef;

}