package dk.profac.jenkinstestmessenger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsTestMessengerApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("test");
		assertThat(true, is(true));
	}

}
