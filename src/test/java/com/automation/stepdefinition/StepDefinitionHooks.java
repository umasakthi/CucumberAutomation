package com.automation.stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepDefinitionHooks {

	

	//Hooks	
		@Before
		public void beforeHooks(Scenario scenario) {
			String name = scenario.getName();
			System.out.println("Scenario name: " + name);
		}

		@After
		private void afterHooks(Scenario scenario) {
			String status = scenario.getStatus();
			System.out.println("Scenario status"+status);
		
		}

	
}
