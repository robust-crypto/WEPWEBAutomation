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

WebUI.navigateToUrl('https://identity-preprod.ea.angloamerican.com/Account/Login?AppCode=WEP-PreProd&ReturnUrl=https://wep-preprod.ea.angloamerican.com/Account/LoginRedirect')

WebUI.setText(findTestObject('Page_Anglo EA Identity  Identity/input_Work Execution Platform_Username'), 'amoam')

WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Next'))

WebUI.setEncryptedText(findTestObject('Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Login'))

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Home/a_SEARCH ERP (1)'))

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/FunctionalLocationRadio'))

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/button_DRILL DOWN'))

WebUI.click(findTestObject('Work Requests/Page_WEP  Work Requests/Page_WEP  Work Requests/Page_WEP  Work Requests/FL-ERPSelect'))

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/FLMostRecent'))

WebUI.click(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/button_SEARCH'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Work Requests/Page_WEP  Work Requests/div_Raised    Priority    Notification No  _35b7a2'), 
    0)

WebUI.click(findTestObject('Page_WEP  Work Requests/Home Navigation'))

WebUI.closeBrowser()

