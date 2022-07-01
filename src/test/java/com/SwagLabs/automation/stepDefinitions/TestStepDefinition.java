package com.SwagLabs.automation.stepDefinitions;

import org.junit.Assert;

import com.SwagLabs.automation.pageObject.TestPageObject;
import com.SwagLabs.automation.utils.Assertions;
import com.SwagLabs.automation.utils.CommonUtils;

import io.cucumber.java.en.*;

public class TestStepDefinition {
	
	CommonUtils commonUtilsObject;
	TestPageObject testPageObjectObject;
	Assertions assertionObject;
	
	
	public TestStepDefinition() {
		this.commonUtilsObject = new CommonUtils();
		this.testPageObjectObject = new TestPageObject();
		this.assertionObject = new Assertions();
	}


	@Given("Je me connecte to the app {string}")
	public void jeMeConnecteToTheApp(String url) {
		commonUtilsObject.get(url);
		
	   
	}
	@When("Je saisis le username {string} et le password {string}")
	public void jeSaisisLeUsernameEtLePassword(String userName, String password) {
	testPageObjectObject.fillField(userName, password);
	   
	}
	@When("Je clique sur le bouton LOGIN")
	public void jeCliqueSurLeBoutonLOGIN() {
		testPageObjectObject.clickOn();
	   
	}
	@Then("Je vérifie affichage un alerte {string}")
	public void jeVérifieAffichageUnAlerte(String elementAlert){

		Assert.assertEquals(elementAlert,(TestPageObject.msg.getText()));

	  
	}


}
