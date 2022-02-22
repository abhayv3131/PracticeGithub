package testNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationCheck {

@Test
@Parameters({"browser","version"})
public void parameterization(String checkbrowser,String versionCheck) {
	
	if(checkbrowser.equalsIgnoreCase("chrome")) {
		Reporter.log("chrome is running",true);
		Reporter.log("chrome is running with version: "+versionCheck,true);

	}
	else if(checkbrowser.equalsIgnoreCase("firefox")){
		Reporter.log("firefox is running",true);
	}
}
}
