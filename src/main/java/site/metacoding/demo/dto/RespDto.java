package site.metacoding.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RespDto<T> {
	private Integer code; // -1 실패, 1 성공
	private String msg; // 통신 결과 메시지로 담기
	private T body; // body데이터를 담는다. object를 사용하면 다운캐스팅이 필요하기 때문에 제네릭을 사용한다.
}
