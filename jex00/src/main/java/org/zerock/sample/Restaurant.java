package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	/* Restaurant ��ü�� Chef Ÿ���� ��ü�� ����
	 * @Setter : �ڵ����� setChef()�� ������ �� ����
	 * @Setter���� ���� onMethod �Ӽ��� �����Ǵ� setChef()��
	 * @Autowired ������̼��� �߰��ϵ��� �Ѵ�
	 * Outline ���� ���� Ŭ���� ���� Ȯ��
	 */
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
