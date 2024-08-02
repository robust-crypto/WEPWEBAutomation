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
	


	WebDriver driver =DriverFactory.getWebDriver()
	
	//driver.findElement(By.xpath("(//li[@class='nav-item nav-dropdown'][1])[1]")).click()
	WebUI.click(findTestObject('Object Repository/Work Orders/Page_WEP  Home/sidebarmax'))
	WebUI.delay(5)
	
	def aa= driver.findElement(By.xpath("//li[@class='nav-item nav-dropdown'][2]/a[@class='nav-link aa-primary nav-dropdown-toggle hide-before w-100 cursorPointer']"))
	aa.click()
	////li[@class='nav-item nav-dropdown'][2]/a[@class='nav-link aa-primary nav-dropdown-toggle hide-before w-100 cursorPointer']
	//(//li[@class='nav-item nav-dropdown'])[6]
	
	
	WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/a_Work Board'))
	WebUI.waitForElementNotPresent(findTestObject('Object Repository/Work Orders/Work Boards/UpdatingWO'), 60)
	WebUI.click(findTestObject('Object Repository/BreakdownOrderObjects/FilterBtn'))
	WebUI.click(findTestObject('Object Repository/BreakdownOrderObjects/ImpactFilter'))
 List<WebElement>  priority = WebUI.findWebElements(findTestObject('Object Repository/BreakdownOrderObjects/HighPriorityFilter'),2)
 
 for (WebElement1 p :priority)
 {
	 WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(p))
	
		//('document.getElementById(\'checkFullyCompleted\').click()', [], FailureHandling.STOP_ON_FAILURE)
	break
 }
	
	WebUI.delay(5)
	
	List<WebElement1> high = driver.findElements(By.xpath("//div[@class='d-flex align-items-center ml-1 pb-2']//img[@class='ml-1 ']"))
	
	def aaa
	WebElement1 operation= null
		for (WebElement1 item : high) {
		
			//def status= item.findElement(By.xpath("//div[@class='d-flex align-items-center ml-1 pb-2']//img[@class='ml-1 ']"))
		
			if (item.getAttribute("data-original-title") == "NOT STARTED")
			{
				
				item.findElement(By.xpath("//img[@src='../img/icon-spanner-filled-C60C30.svg']")).click()
				
				//operation = item
				//item.click()
				WebUI.waitForElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/WOModal'), 10,FailureHandling.STOP_ON_FAILURE)
				
				
				//if (WebUI.getText(findTestObject('Object Repository/MyTeamsWork/lblOperationContolKey'))== "PMIN") {	
					WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkButton'))		
					WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/ContinueToStartWork'),
						2)
				WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkYes'))
				
					break
					//}
					//else {
						
						
						WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))
						
					//}
					
					
				
						
				
			}
			
			
		
			
	
		}
		
	//	WebUI.callTestCase(findTestCase('WorkOrders/BreakdownConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)
		
		
		
		
		
			
			
	
			
			
		
	
	
		
		
		
		
		
		
		
		
		
		
