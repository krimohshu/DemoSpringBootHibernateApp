//package demo;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.demo.request.HomeRequest;
//
//@RunWith(SpringRunner.class)
////@SpringBootTest
////@SpringApplicationConfiguration(WebApplication.class) 
////@WebMvcTest(HomeController.class)
//public class HomeTest {
//
//	@Autowired
//	private TestRestTemplate restTemplate;
//
//	@Test
//	public void createUserTest() {
//		HomeRequest homeRequest = new HomeRequest();
//
//		homeRequest.setUserName("Namo");
//		homeRequest.setFirstName("Narendra");
//		homeRequest.setLastName("Modi");
//
//		ResponseEntity<String> body = this.restTemplate.postForEntity("/api/v1/home/users", homeRequest, String.class);
//
//		System.out.println("The Response body is " + body);
//
//		
//		 * Map<String, Object> requestBody = new HashMap<String, Object>(1);
//		 * UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(
//		 * "http://localhost:8080/api/v1/home/users"); HttpEntity<String>
//		 * httpEntity = TestUtils.getHttpEntity(requestBody);
//		 * HttpEntity<ResponseDto<IndicatorThreshold>> response =
//		 * restTemplate.exchange(builder.build().encode().toUri(),
//		 * HttpMethod.POST, httpEntity, new
//		 * ParameterizedTypeReference<ResponseDto<IndicatorThreshold>>() { });
//		 
//	}
//
//}
