package site.metacoding.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// Http Method -> Mapping 기술
// GET - >주소창, 하이퍼링크
// POST, GET -> form 태그
// PUT, DELETE, GET, POST ->JS

// 포스트맨 -> 4가지 요청을 쉽게 테스트 해볼 수 있다.
@RestController //data를 응답
public class FirstController {
	
	
//protocol로 약속되어있어 강제성이 없다.
//주소가 똑같아도 메서드가 다르면 해당 메서드 호출
	@GetMapping("/first")
	public String getData() {
		return "<h1>data</h1>";
	}
	
	@PostMapping("/first")
	public String postData() {
		return "<h1>insert data</h1>";
	}

	@PutMapping("/first")
	public String putData() {
		return "<h1>put data</h1>";
	}
	
	@DeleteMapping("/first")
	public String deleteData() {
		return "<h1>delete data</h1>";
	}

}
