package site.metacoding.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import site.metacoding.demo.domain.Third;

// 고급 데이터 받기 (json, x-www-form-urlencoded, text)

@RestController("/third{id}")
public class ThirdController {
	public String getData(@PathVariable Integer id) {
		return "id : " + id;
	}

@PostMapping("/third")
public String postData(Third third) { // request dto 
	// 인자값 object를 자동으로 읽어서 setter메서드를 실행한다.
	return "id : " + third.getId() +  ", title : " + third.getTitle() + ", content : " + third.getContent();
}

//@PostMapping("/third")
//public String helloData(HttpServletRequest request) {
//	try {
//		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
//		String con = br.readLine();
//		System.out.println(con);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return "hello";
//}


// UPDATE third SET title = ?, content = ?, WHERE id =?
// 프로토콜이라서 외워야 함 - body로 보내면 안되고 주소로 보내야 됨

@PutMapping("/third/{id}")
public String putData(@PathVariable Integer id, Third third) {
	third.setId(id);
	return third.toString();
}

@PutMapping("/third/{id}/json")
public String putJsonData(@PathVariable Integer id, @RequestBody Third third) { // json형으로 데이터를 받을 수 있다.
	return third.toString();
}
}
