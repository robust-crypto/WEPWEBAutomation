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


//WebUI.click(findTestObject('Object Repository/Work Orders/Page_WEP  Home/sidebar-minimizerbtn'))
WebDriver driver =DriverFactory.getWebDriver()
//def aa= driver.findElement(By.xpath("//a[@href='/workorder/TeamWorkBoardList']"))
//aa.click()

WebUI.click(findTestObject('Object Repository/Work Orders/Page_WEP  Home/sidebarmax'))
WebUI.delay(5)
	
def aa= driver.findElement(By.xpath("//li[@class='nav-item nav-dropdown'][2]/a[@class='nav-link aa-primary nav-dropdown-toggle hide-before w-100 cursorPointer']"))
aa.click()
WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/a_My Teams Work'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Work Orders/Work Boards/UpdatingWO'), 60)

WebUI.dragAndDropToObject(findTestObject('Object Repository/MyTeamsWork/OperationsDragable'), findTestObject('Object Repository/MyTeamsWork/DragTo'))
WebUI.verifyElementPresent(findTestObject('Object Repository/MyTeamsWork/pop-upxpath'), 10, FailureHandling.STOP_ON_FAILURE)

def bb =  WebUI.getText(findTestObject('Object Repository/MyTeamsWork/lblContinue'))

WebUI.verifyEqual(bb, "Would you like to continue?")

WebUI.click(findTestObject('Object Repository/MyTeamsWork/btnSaveAssignment'))



WebUI.delay(10)

List<WebElement> elements = driver.findElements(By.xpath("//div[@class='smooth-dnd-draggable-wrapper']"))


	for (WebElement1 item : elements) {
	
		
			item.click()
			item.findElement(By.xpath("//div[@class='d-flex']//img[@class='operation_container textAlignRight cursorPointer']")).click()
		driver.findElement(By.xpath("//img[@class='pl-0 pr-1 cursorPointer textAlignRight marginTop5']")).click()
			
		WebUI.waitForElementPresent(findTestObject('Object Repository/MyTeamsWork/WOmodal'), 20)
		WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))
		break
	}
	WebUI.delay(5)
	//assign by Checkbox
	int i =0
List<WebElement> Op = driver.findElements(By.xpath("//input[@type='checkbox']"))
	
				for (WebElement1 check : Op) {
					
				
				if (i >= 2) {
					
					WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(check))
					break
				   
				       }
				
				i++
						
		}
	


		List<WebElement> People = driver.findElements(By.
			xpath("//div[@class='d-table maximalUserWidth cursorPointer userMember']//input[@type='checkbox']"))
	
		int p =0
			for (WebElement1 Person : People) {
				
			
			if (p >= 2) {
				
				WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(Person))
				break
			   
				   }
			
			p++
					
	}

	
	
	
	WebUI.click(findTestObject('Object Repository/MyTeamsWork/AssignButton'))

	def t =  WebUI.getText(findTestObject('Object Repository/MyTeamsWork/lblContinue'))
	
	WebUI.verifyEqual(t, "Would you like to continue?")
	
	WebUI.click(findTestObject('Object Repository/MyTeamsWork/btnSaveAssignment'))
	
	
	
	//unassign
	//List<WebElement> AssignedOperations = driver.findElements(By.
	//	xpath("//div[@class='d-table operation-container w-100 h-100']"))
	WebUI.delay(5)

	
			
	
			WebUI.dragAndDropToObject(findTestObject('Object Repository/MyTeamsWork/OperationAssigned'),
				 findTestObject('Object Repository/MyTeamsWork/UnassignDropZone'))
			
		   
			   
		
			


WebUI.verifyElementPresent(findTestObject('Object Repository/MyTeamsWork/UnassignDivpopUP'),5)
	
WebUI.click(findTestObject('Object Repository/MyTeamsWork/Unassign'))
