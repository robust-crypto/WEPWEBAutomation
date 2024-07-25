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

public void ToggleSideMenu()
{
WebUI.click(findTestObject('Object Repository/Work Orders/Page_WEP  Home/sidebarmax'))
	WebDriver driver =DriverFactory.getWebDriver()
	def aa= driver.findElement(By.xpath("(//a[@href='/WorkOrder/WorkOrderSapList'])[2]"))
	aa.click()
	
}

//(//li[@class='nav-item nav-dropdown']/a[@class='nav-link aa-primary nav-dropdown-toggle hide-before w-100 cursorPointer'])[1]
ToggleSideMenu()

//WebUI.click(findTestObject('Object Repository/Work Orders/WorkWeek/a_Work Week'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Work Orders/Work Boards/UpdatingWO'), 60)

WebUI.click(findTestObject('Object Repository/Work Orders/WorkWeek/tglOperationWorkWeek'))

WebDriver driver =DriverFactory.getWebDriver()


List<WebElement> elements = driver.findElements(By.xpath("//img[@class='mt-1 col-1 px-0']"))


	for (WebElement1 item : elements) {
	
		if ( item.getAttribute("data-original-title") == "NOT STARTED")
		{ WebUI.delay(5)
			
			
			
			
			
			
			
			
			item.click()
			//WebUI.executeJavaScript('document.getElementById(\'checkFullyCompleted\').click()', [], FailureHandling.STOP_ON_FAILURE)
			
			WebUI.waitForElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/WOModal'), 10)
		
			if (WebUI.getText(findTestObject('Object Repository/MyTeamsWork/lblOperationContolKey'))== "PMIN") {
						
					
					WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkButton'))
					
					
					
					
				
					WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/ContinueToStartWork'),
						2)
				
					WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkYes'))
				
					break
					}
					else if (WebUI.getText(findTestObject('Object Repository/MyTeamsWork/lblOperationContolKey'))== "PMES") {
						
						
						WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))
						continue
						
					}
		
					
			
		}
		
	
		

	}
	//WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/tabOperationWO'))
	
	//driver.findElement(By.xpath("//a[@id='mainoperations-tab']")).click()
	//List<WebElement> operations = driver.findElements(By.xpath("//ul[@class='row nav nav-tabs remoBorderBottom']//img[@data-toggle='tooltip']"))
	
	
	//for (WebElement1 op : operations) {
	//	if ( op.getAttribute("data-original-title") == "NOT STARTED")
		//{
			
			//op.click()
			//break
			
	//	}
		
	//}
	WebUI.callTestCase(findTestCase('WorkOrders/PartialConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)
	
	
	

