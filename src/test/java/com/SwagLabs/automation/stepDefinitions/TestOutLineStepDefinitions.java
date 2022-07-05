package com.SwagLabs.automation.stepDefinitions;

import org.junit.Assert;

import com.SwagLabs.automation.pageObject.TestPageObject;

import io.cucumber.java.en.*;

public class TestOutLineStepDefinitions {


	@Then("Je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPage(String title) {
		
		Assert.assertEquals(title, TestPageObject.prod.getText());
		System.out.println("okkkk");
		

	}

}
