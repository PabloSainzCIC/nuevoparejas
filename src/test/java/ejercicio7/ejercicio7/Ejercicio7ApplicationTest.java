package ejercicio7.ejercicio7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = {
    "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
})
class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGetAllUsersWithPostMethod() {
        ResponseEntity<String> response = restTemplate.exchange("/users", HttpMethod.POST, null, String.class);
        assertEquals(HttpStatus.METHOD_NOT_ALLOWED, response.getStatusCode());
    }
}
