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
WebUI.click(findTestObject('Object Repository/Work Orders/Page_WEP  Home/sidebar-minimizerbtn'))
	WebDriver driver =DriverFactory.getWebDriver()
	def aa= driver.findElement(By.xpath("(//li[@class='nav-item nav-dropdown']/a[@class='nav-link aa-primary nav-dropdown-toggle hide-before w-100 cursorPointer'])[1]"))
	aa.click()
	
}
//ToggleSideMenu()


WebDriver driver =DriverFactory.getWebDriver()


//WebUI.click(findTestObject('Object Repository/Work Orders/Work Boards/a_Search ERP'))

WebDriver driver =DriverFactory.getWebDriver()
def aa= driver.findElement(By.xpath("//a[@href='/workorder/WorkOrderSapSearchERPList']"))
aa.click()





//Search with WC
WebUI.click(findTestObject('Object Repository/SearchERPElements/WCDropdown'))

SelectWCFloc(GlobalVariable.SearchERPwcCodeDescriprionAM,"//span[@class='multiselect__option']//span")


//VerifyWCDataReturned(GlobalVariable.SearchErpVerifyWCAM)



	
//Search with Functional Location
WebUI.click(findTestObject('Object Repository/SearchERPElements/FunctionalLocationRadioBTN'))

WebUI.click(findTestObject('Object Repository/SearchERPElements/DrillDownButton'))

SelectWCFloc(GlobalVariable.FlocSearhcERPAM,"//div[@class='mb-0 aa-primary flex-grow-1']")




//VerifyflocDataReturned(GlobalVariable.SearchERPflocAM)

//Search with Equipment 




//WebUI.click(findTestObject('Object Repository/SearchERPElements/EquipmentNumberRadiobtn'))

//Search with WO Number

WebUI.click(findTestObject('Object Repository/SearchERPElements/WorkOrderNumberRadiobtn'))

WebUI.setText(findTestObject('Object Repository/SearchERPElements/txtWONumber'),GlobalVariable.SearchERPWONumberAM)

WebUI.click(findTestObject('Object Repository/SearchERPElements/WCSearchbtn'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/WOModal'), 10)
def woNumber = WebUI.getText(findTestObject('Object Repository/SearchERPElements/lblWorkOrderNo'))

WebUI.verifyEqual(woNumber, GlobalVariable.SearchERPWONumberAM)
WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))



public void SelectWCFloc(def name,def location) {
	
	
	
		
		WebDriver driver =DriverFactory.getWebDriver()
	List<WebElement> elements = driver.findElements(By.xpath(location))
	
	for (WebElement1 item : elements) {
	   if(item.getText()== name)
	   {
		   item.click()
		   break
		   
		   
		   
	   }
	}
	WebUI.click(findTestObject('Object Repository/SearchERPElements/WCSearchbtn'))
	}
	
	
	
public void VerifyflocDataReturned(def name) {
		WebDriver driver =DriverFactory.getWebDriver()
	List<WebElement> WOs = driver.findElements(By.xpath("//tr[@class='accordion-item border-bottom cursorPointer']"))
	
	for (WebElement1 item : WOs) {
		
		item.click()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/WOModal'), 10)
		
		def WflocActual = WebUI.getText(findTestObject('Object Repository/SearchERPElements/lblFloc'))
		WebUI.verifyEqual(WflocActual, name)
		
		
		WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))
	
		
	}
}

public void VerifyWCDataReturned(def name) {
	WebDriver driver =DriverFactory.getWebDriver()
List<WebElement> WOs = driver.findElements(By.xpath("//tr[@class='accordion-item border-bottom cursorPointer']"))

for (WebElement1 item : WOs) {
	
	item.click()
	WebUI.waitForElementPresent(findTestObject('Object Repository/Work Orders/Work Boards/OperationElements/WOModal'), 10)
	
	def WorkCenterActual = WebUI.getText(findTestObject('Object Repository/SearchERPElements/lblWCFieldWO'))
	WebUI.verifyEqual(WorkCenterActual, name)
	
	
	WebUI.click(findTestObject('Object Repository/ConfirmationScreen/CloseWOPop-up'))

	
}
}