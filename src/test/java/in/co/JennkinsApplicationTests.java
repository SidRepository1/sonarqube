package in.co;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.co.test.TestForJenkins;

@SpringBootTest
class JennkinsApplicationTests {

	@Autowired
	private TestForJenkins jenkinTest;

	@Test
	void contextLoads() {
		String name = jenkinTest.test("sidd");
		assertThat(name).isEqualTo("sidd");
	}

}
