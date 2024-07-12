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

WebUI.click(findTestObject('Object Repository/Work Requests/button_Next (1)'))

WebUI.setText(findTestObject('Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), '12345')

WebUI.click(findTestObject('Page_Anglo EA Identity  Identity/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_WEP  Home/Pending Approval View ALL'))

WebUI.delay(10)

WRNumber1 = WebUI.getText(findTestObject('Object Repository/Page_WEP  Work Requests/Work Request 1'), FailureHandling.STOP_ON_FAILURE)

WRNumber2 = WebUI.getText(findTestObject('Object Repository/Page_WEP  Work Requests/Work Request 2'), FailureHandling.STOP_ON_FAILURE)

WRNumber3 = WebUI.getText(findTestObject('Object Repository/Page_WEP  Work Requests/Work Request 3'), FailureHandling.STOP_ON_FAILURE)

WRNumber4 = WebUI.getText(findTestObject('Object Repository/Page_WEP  Work Requests/Work Request 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.executeJavaScript("document.getElementById('$WRNumber1').click()", [], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript("document.getElementById('$WRNumber2').click()", [], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript("document.getElementById('$WRNumber3').click()", [], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript("document.getElementById('$WRNumber4').click()", [], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_WEP  Work Requests/bulkREJECT'))

WebUI.setText(findTestObject('Page_WEP  Work Requests/rejectionComment1'), 'Automated Bulk Rejection')

WebUI.setText(findTestObject('Page_WEP  Work Requests/rejectionComment2'), 'Automated Bulk Rejection')

WebUI.setText(findTestObject('Page_WEP  Work Requests/rejectionComment3'), 'Automated Bulk Rejection')

WebUI.setText(findTestObject('Page_WEP  Work Requests/rejectionComment4'), 'Automated Bulk Rejection')

WebUI.click(findTestObject('Page_WEP  Work Requests/approvalSUBMIT'))

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/Successfully Rejected1'), 'Successfully Rejected')

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/Successfully Rejected2'), 'Successfully Rejected')

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/Successfully Rejected3'), 'Successfully Rejected')

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/Successfully Rejected4'), 'Successfully Rejected')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_FINISH'))

