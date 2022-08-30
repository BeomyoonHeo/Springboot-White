package site.metacoding.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.demo.domain.Four;
import site.metacoding.demo.dto.RespDto;


//object로 return시 gson으로 바꿔준다.
@RestController
public class FourController {
	
	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; //DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달
		//메세지컨버터가 getter를사용해 오브젝트의 값을 추출해서 Json으로 변환
	}
	
	@GetMapping("/four/data")
	public ResponseEntity<?> getData2() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		ResponseEntity<Four> response = new ResponseEntity<>(four, HttpStatus.CREATED);
		return response; 
	}
	
	@GetMapping("/four/dto")
	public RespDto<?> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(1, "통신성공", four);
	}
}
