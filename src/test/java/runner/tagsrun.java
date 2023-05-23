package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
        glue = {"Stepss"}

)

public class tagsrun {
}
