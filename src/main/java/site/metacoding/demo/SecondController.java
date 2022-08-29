package site.metacoding.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기
// GET -> QueryString - > Form(Get) -> 브라우저 (주소 뒤 ? 붙이기)
// POST, PUT -> http body 담아준다. -> Form(POST) -> JS
// DELETE -> body가 없음 -> QueryString, PathVariable(PK)

@RestController
public class SecondController {
	
	@GetMapping("/second/{id}") // PK(id)가 1인것
	public String getData(@PathVariable Integer id) {
		
		return "id : " + id; 
	}
	
	//QueryString = x-www-form-urlencoded 타입이다.
	@GetMapping("/second") // PK(id)가 1인것
	public String getData2(String title, String content) {
		
		return "title : " + title + ", content : " + content; 
	}
	
	//BR -> title제목&content=내용, x-www-urlencoded(content type을 적어 파싱을 어떻게 할지 알려준다)
	@PostMapping("/second")
	public String postData(String title, String content) { // 스프링 파싱 기본전략 : x-www-form-urlencoded
		System.out.println(title + "" + content);
		return "title : " + title + ", content : " + content; 
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) {
		return "titleput : " + title + ", contentput : " + content; 
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteDate(@PathVariable Integer id){
		return "delete id : " + id; 
	}
}
