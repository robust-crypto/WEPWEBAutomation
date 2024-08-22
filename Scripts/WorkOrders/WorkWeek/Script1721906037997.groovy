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
//WebUI.click(findTestObject('Object Repository/Work Orders/Page_WEP  Home/sidebarmax'))
	WebDriver driver =DriverFactory.getWebDriver()
	def aa= driver.findElement(By.xpath("(//a[@href='/WorkOrder/WorkOrderSapList'])[2]"))
	aa.click()
	
}

//(//li[@class='nav-item nav-dropdown']/a[@class='nav-link aa-primary nav-dropdown-toggle hide-before w-100 cursorPointer'])[1]
ToggleSideMenu()

//WebUI.click(findTestObject('Object Repository/Work Orders/WorkWeek/a_Work Week'))
WebUI.maximizeWindow()
WebUI.waitForElementNotPresent(findTestObject('Object Repository/Work Orders/Work Boards/UpdatingWO'), 60)

WebUI.click(findTestObject('Object Repository/Work Orders/WorkWeek/tglOperationWorkWeek'))
WebUI.delay(5)

WebDriver driver =DriverFactory.getWebDriver()


List<WebElement1> wwo = driver.findElements(By.xpath
	("//div[@class='list-group-item d-flex accordionSublist px-1 row mr-0 ml-0 w-100 mt-1 pb-0 center cursorPointer']//img[@class='mt-1 col-1 px-0']"))
for (WebElement1 o : wwo) {
	if ( o.getAttribute("data-original-title") == "NOT STARTED")
		{ WebUI.delay(10)	
			o.click()
			
			WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/WOModal'), 
				10,FailureHandling.STOP_ON_FAILURE)
		
			if (WebUI.getText(findTestObject('Object Repository/MyTeamsWork/lblOperationContolKey'))== "PMIN" &&
				WebUI.verifyElementNotVisible(findTestObject('Object Repository/Work Orders/WOBreakdownIcon'),FailureHandling.OPTIONAL)){
						
					
					WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkButton'))
					
					
					
					
				
					WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/ContinueToStartWork'),
						2)
				
					WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkYes'))
				
					break
					}
					else  {
						
						
						WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))
						continue
						
					}
		
					
			
		}
		
	
		

	}
	
	WebUI.callTestCase(findTestCase('WorkOrders/PartialConfirmation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
	
	

