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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.Date
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as WebElement
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.PreprodENV)

//WebUI.maximizeWindow()


for (int i = 0; i < 2; i++)
	
	 {
    WebUI.setText(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Username'), 
        GlobalVariable.PlatsUsers[i])

    WebUI.click(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/button_Next'))

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), 
        'iGDxf8hSRT4=')

    WebUI.click(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/button_Login'))
  
	GlobalVariable.LogedUser= GlobalVariable.PlatsUsers[i];
	
	

WebUI.callTestCase(findTestCase('WorkOrders/WorkBoard'), [:], FailureHandling.STOP_ON_FAILURE)
	
  WebUI.callTestCase(findTestCase('WorkOrders/WorkWeek'), [:], FailureHandling.STOP_ON_FAILURE)
   
   
  WebUI.callTestCase(findTestCase('WorkOrders/MyTeamsWork'), [:], FailureHandling.STOP_ON_FAILURE)
  //WebUI.callTestCase(findTestCase('WorkOrders/SearchERPWO'), [:], FailureHandling.STOP_ON_FAILURE)
  
  
	//WebUI.callTestCase(findTestCase('WorkOrders/BulkSignoff'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/Page_WEP  Home/ProfileMenu'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Home/a_Logout'))
 
}
//WebUI.closeBrowser()


