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
import java.util.Date as Date
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as WebElement
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.PlatsUsers)

WebUI.maximizeWindow()

<<<<<<< HEAD
for (int i = 0; i < 1; i++) {
=======

for (int i = 0; i < 1; i++)
	
	 {
>>>>>>> branch 'main' of https://github.com/robust-crypto/WEPWEBAutomation.git
    WebUI.setText(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Username'), 
        GlobalVariable.PlatsUsers[1])

    WebUI.click(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/button_Next'))

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), 
        'iGDxf8hSRT4=')

    WebUI.click(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/button_Login'))

<<<<<<< HEAD
    WebUI.callTestCase(findTestCase('Work Orders'), [:], FailureHandling.STOP_ON_FAILURE)
=======
	
	
	
	
	
	
   WebUI.callTestCase(findTestCase('WorkBoard'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('WorkWeek'), [:], FailureHandling.STOP_ON_FAILURE)
  WebUI.click(findTestObject('Object Repository/Page_WEP  Home/ProfileMenu'))
>>>>>>> branch 'main' of https://github.com/robust-crypto/WEPWEBAutomation.git

<<<<<<< HEAD
    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/ProfileMenu'))

    WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/a_Logout'))
=======
  WebUI.click(findTestObject('Object Repository/Page_WEP  Home/a_Logout'))
  WebUI.closeBrowser()
>>>>>>> branch 'main' of https://github.com/robust-crypto/WEPWEBAutomation.git
}



