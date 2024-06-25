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
import org.openqa.selenium.Keys
import org.eclipse.persistence.jpa.jpql.Assert
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.Date
import org.openqa.selenium.WebElement as WebElement1
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as WebElement
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
	

WebUI.click(findTestObject('Object Repository/Work Orders/Page_WEP  Home/sidebar-minimizerbtn'))
	WebDriver driver =DriverFactory.getWebDriver()
	def aa= driver.findElement(By.xpath("//li[@class='nav-item nav-dropdown'][2]/a[@class='nav-link aa-primary nav-dropdown-toggle hide-before w-100 cursorPointer']"))
	aa.click()
	
	
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/a_Work Board'))
	WebUI.waitForElementNotPresent(findTestObject('Object Repository/Work Orders/Work Boards/UpdatingWO'), 60)
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='d-flex align-items-center ml-1 pb-2']//img[@class='ml-1 ']"))
	
	def aaa
	WebElement1 operation= null
		for (WebElement1 item : elements) {
		
			if ( item.getAttribute("data-original-title") == "NOT STARTED")
			{
				operation = item
				item.click()
				WebUI.waitForElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/WOModal'), 10)
				
				WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkButton'))
					WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/ContinueToStartWork'), 2)
					WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkYes'))
			
						
				break
			}
			
		
			
	
		}
		
		WebUI.callTestCase(findTestCase('PartialConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)
		
		
		
			
			
	
			
			
		
	
	
		
		
		
		
		
		
		
		
		
		
