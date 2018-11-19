package testScripts;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageRepos.AlertControl;

public class UiKit extends BaseClass {
 
	AlertControl ac;

	@Test
	public void search() {
		 ac =  new AlertControl(driver);
		System.out.println(driver);
		ac.simpleAert();
		 
	}
	
	
}