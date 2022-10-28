import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Username_valid_password_invalid {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to Sauce Demo Homepage")
	def navigateToSauceDemo(String name) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.saucedemo.com/')

		WebUI.maximizeWindow()
	}

	@When("I fill username with (.*) and (.*)")
	def insertUsernamePassword(String Username,String Password) {
		WebUI.setText(findTestObject('Login_Obj/username_field'), Username)

		WebUI.setEncryptedText(findTestObject('Login_Obj/password_field'), Password)
	}

	@When("I click Logins Button")
	def clickButtonLogin() {

		WebUI.click(findTestObject('Object Repository/Login_Obj/input_standard_userlocked_out_userproblem_u_0dff71'))
	}

	@Then("I should be able to see error message (.*)")
	def verifyMessageErrors(Error_message) {
		WebUI.verifyTextPresent(Error_message, false)
		WebUI.closeBrowser()
	}
}