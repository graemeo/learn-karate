package animals.cats;

import cucumber.api.CucumberOptions;
import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(features = "src/test/java/animals/cats/cats.feature")
public class CatsRunner {
	
}
