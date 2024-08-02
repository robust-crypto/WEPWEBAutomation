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
    'samuv')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_Anglo EA Identity  Identity/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_Anglo EA Identity  Identity/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/i_My Work Requests_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/div_Maintenance Request (M1)  Maintenance Request'))

WebUI.check(findTestObject('Page_WEP Home DeBeers/checkbox1'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/input_Maintenance Request_followOnWorkRequestID'))

WebUI.setText(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/input_Related Work Order Number_form-contro_6630d0'), 
    '32058075')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_NEXT-gk'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/span_DRILL DOWN'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/img_VENETIA_mr-2 border-left pl-2'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_NEXT-gk'))

WebUI.setText(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/textarea_Description_descriptionimage'), 
    'Follow on')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/button_NEXT-3'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/div_VEHH1 - MAIN VOE BARLOWORLD WORKSHOP'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/div_Low  All Other'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/i_Required date_fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/td_14'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/button_NEXT-gk'))

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/button_SUBMIT'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/span_Thank you for your valuable input. Tog_edd0b6'), 
    'Thank you for your valuable input. Together through the operating Model, we can ensure that we always do the Right Work, at the Right Time, and in the Right Way!')

WebUI.click(findTestObject('Object Repository/Page_WEP Home DeBeers/Page_WEP  Home/button_FINISH'))

