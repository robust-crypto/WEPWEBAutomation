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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.PreprodENV)

WebUI.maximizeWindow()

for (int i = 0; i < 2; i++) {
    WebUI.setText(findTestObject('Page_Anglo EA Identity  Identity/input_Work Execution Platform_Username'), GlobalVariable.PortUsers[
        i])

    WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Next'))

    WebUI.setEncryptedText(findTestObject('Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), 'iGDxf8hSRT4=')

    WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Login'))

    WebUI.callTestCase(findTestCase('AOP Work Request POR/Raise Work Request-POR'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Work Requests/ProfileMenu'))

    WebUI.click(findTestObject('Work Requests/a_Logout'))
}

WebUI.closeBrowser()

