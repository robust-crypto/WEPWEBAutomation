import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.eclipse.persistence.jpa.jpql.Assert
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.Date
import org.openqa.selenium.WebElement as WebElement1
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as WebElement
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


WebUI.click(findTestObject('Object Repository/Work Boards/SignOffTab'))

WebUI.delay(5)
WebDriver driver =DriverFactory.getWebDriver()

WebUI.executeJavaScript('document.getElementById(\'selectAllCheckbox\').click()', [], FailureHandling.STOP_ON_FAILURE)
   
	WebUI.click(findTestObject('Object Repository/Work Boards/SignOffBulkBTN'))
	WebUI.waitForElementPresent(findTestObject('Object Repository/Work Boards/BulkSignOffpop-up'),5)
	
	List<WebElement> elements = driver.findElements(By.xpath("//textarea[@class='form-control w-100 bold subTabsTitle']"))

	for (WebElement1 item : elements) {
		
		
		
		
		item.sendKeys("Automation Bulk Sign off")
		
	}
	
	WebUI.click(findTestObject('Object Repository/Work Boards/DigitalSignBulkSignOff'))
	
	WebUI.click(findTestObject('Object Repository/Work Boards/SignOffBulkBTN'))
	//def signedoff = findTestObject('Object Repository/Work Boards/BulkSignOfflblSuccess')
	
	WebUI.verifyEqual("Successfully signed off", WebUI.getText(findTestObject('Object Repository/Work Boards/BulkSignOfflblSuccess')))
	
	WebUI.click(findTestObject('Object Repository/Work Boards/BulkSignoffFinishBTN'))