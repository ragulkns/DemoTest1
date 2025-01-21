package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
   
                features={"src/test/resources/Features"},
                glue={"stepDefinition"},
                dryRun = false,
                //tags = "@TC1",
                plugin = {"pretty", "json:target\\cucumber.json",
                       "html:target\\htmlreport.html"}
 
)
public class Runner extends AbstractTestNGCucumberTests {
   
   
}