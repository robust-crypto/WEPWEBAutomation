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


WebDriver driver =DriverFactory.getWebDriver()


			
WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/AssignmentElements/btnAssign'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/AssignmentElements/xpathListOfAllPeopleToAssign'),2)

List<WebElement> People = driver.findElements(By.xpath("//li[@class='d-flex align-items-start selectPersons']"))

			for (WebElement1 person : People) {
				
			def	Name = person.findElement(By.xpath("//label[@class='flex-wrap personsName px-0']")).text
			
					WebUI.executeJavaScript('document.getElementById(\'0b40dabd-442e-47e1-a913-5d4190e987cf\').click()', [],
						 FailureHandling.STOP_ON_FAILURE)
					WebUI.verifyEqual(Name, WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/AssignmentElements/AssignedPeople')))
					
				break
			}
			if (WebUI.getText(findTestObject('Object Repository/MyTeamsWork/lblOperationContolKey'))== "PMIN") {
					
				
				WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/AssignmentElements/btnAssign'))
				
				WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/AssignmentElements/xpathListOfAllPeopleToAssign'),2)
				
				
				List<WebElement> elements = driver.findElements(By.xpath("//li[@class='d-flex align-items-start selectPersons']"))
		
					for (WebElement1 item : elements) {
						
					def	Name =item.findElement(By.xpath("//label[@class='flex-wrap personsName px-0']")).text
					
					
							WebUI.executeJavaScript('document.getElementsByClassName(\'custom-control-input cursorPointer\').click()', [],
								 FailureHandling.STOP_ON_FAILURE)
							WebUI.verifyEqual(Name, WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/AssignmentElements/AssignedPeople')))
							
						break
					}
					
					
					
				
				
					WebUI.getText(findTestObject('Object Repository/Work Orders/Work Boards/AssignmentElements/AssignedPeople'))
			
				WebUI.verifyElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/ContinueToStartWork'),
					2)
			
				WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/StartWorkYes'))
			
				break
			}
	
				else {
					
					
					WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))
					
				}
				
				
			
					
			
		
		
	
		







