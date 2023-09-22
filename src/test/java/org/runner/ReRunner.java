package org.runner;

	import org.junit.AfterClass;
	import org.junit.runner.RunWith;
	import org.runner.JVMReport;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features= "@C:\\Users\\Hp\\parithi\\EyeBuyDirectCucumber\\Rerun\\rerun.txt",
	glue= {"org.stepdefinition","org.hooks"},dryRun=false,monochrome=true,plugin= {"pretty",
			"html:C:\\Users\\Hp\\parithi\\EyeBuyDirectCucumber\\All Reports\\HTML Report",
			"json:C:\\Users\\Hp\\parithi\\EyeBuyDirectCucumber\\All Reports\\JSon Report\\EyeBuyDirect.json",
			"junit:C:\\Users\\Hp\\parithi\\EyeBuyDirectCucumber\\All Reports\\JUnit\\EyeBuyDirect.xml",
	})

	public class ReRunner {
		@AfterClass
		public static void tc1() {
		JVMReport.getJvmReport("All Reports\\JVM Report","All Reports\\JSon Report\\EyeBuyDirect.json");
		}
	}
