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
 * �ν��Ͻ� ������ ����� ��� ���� �Ķ���ͷ� �޴�
 * �����ڸ� �ۼ�
 * ���� ���� ���� �ν��Ͻ� ������ �߿��� Ư���� ������ 
 * ���ؼ��� �����ڸ� �ۼ��ϰ� �ʹٸ�  
 * @NonNull�� @RequiredArgsConstructor ������̼� �̿�
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