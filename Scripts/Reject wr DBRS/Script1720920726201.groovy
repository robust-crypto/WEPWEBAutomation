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

WebUI.setText(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Username'), 
    'samugk')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_Anglo EA Identity  Identity/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_Anglo EA Identity  Identity/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/td_Activity Report'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/button_REJECT'))

WebUI.setText(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/textarea_Reason for Cancellation_cancellati_651940'), 
    'Rejected by supervisor')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/button_SUBMIT'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/span_Successfully Rejected'), 
    'Successfully Rejected')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/button_FINISH'))

