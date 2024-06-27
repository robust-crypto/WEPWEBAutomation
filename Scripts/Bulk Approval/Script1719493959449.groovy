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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl('https://identity-preprod.ea.angloamerican.com/Account/Login?AppCode=WEP-PreProd&ReturnUrl=https://wep-preprod.ea.angloamerican.com/Account/LoginRedirect')

WebUI.setText(findTestObject('Page_Anglo EA Identity  Identity/input_Work Execution Platform_Username'), 'amoam')

WebUI.click(findTestObject('Object Repository/Work Requests/button_Next (1)'))

WebUI.setText(findTestObject('Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), '12345')

WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Home/a_VIEW_ALL 95'))

WebUI.executeJavaScript('document.getElementById(\'14453699\').click()', [], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('document.getElementById(\'14453698\').click()', [], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('document.getElementById(\'14453697\').click()', [], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('document.getElementById(\'14453696\').click()', [], FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_APPROVE'))

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Upper cost limit_mb-0 w-100 form-cont_8248c2'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/textarea_Comments_mb-0 w-100 form-control r_b665ba'), 
    'Automated Bulk Approval')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Upper cost limit_mb-0 w-100 form-cont_8248c2'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/textarea_Comments_mb-0 w-100 form-control r_b665ba'), 
    'Automated Bulk Approval')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Upper cost limit_mb-0 w-100 form-cont_8248c2'), 
    '0')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/div_Notification 14453702'))

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Upper cost limit_mb-0 w-100 form-cont_8248c2'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/textarea_Comments_mb-0 w-100 form-control r_b665ba'), 
    'Automated Bulk Approval')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/input_Upper cost limit_mb-0 w-100 form-cont_8248c2'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/Page_WEP  Work Requests/textarea_Comments_mb-0 w-100 form-control r_b665ba'), 
    'Automated Bulk Approval')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_SUBMIT'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP  Work Requests/h5_Successfully approved'), 'Successfully approved')

WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP  Work Requests/h5_Successfully approved'), 'Successfully approved')

WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP  Work Requests/h5_Successfully approved'), 'Successfully approved')

WebUI.verifyElementText(findTestObject('Object Repository/Page_WEP  Work Requests/h5_Successfully approved'), 'Successfully approved')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_FINISH'))

