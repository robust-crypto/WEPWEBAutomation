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

WebUI.click(findTestObject('Work Requests/Page_WEP  Work Requests/Page_WEP  Work Requests/bulkAPPROVE'))

WebUI.setText(findTestObject('Page_WEP  Work Requests/uppercost1'), '100000')

WebUI.setText(findTestObject('Page_WEP  Work Requests/approvalComment1'), 'Automated Bulk Approval')

WebUI.setText(findTestObject('Page_WEP  Work Requests/uppercost2'), '10000')

WebUI.setText(findTestObject('Page_WEP  Work Requests/approvalComment2'), 'Automated Bulk Approval')

WebUI.setText(findTestObject('Page_WEP  Work Requests/uppercost3'), '10000')

WebUI.setText(findTestObject('Page_WEP  Work Requests/approvalComment3'), 'Automated Bulk Approval')

WebUI.setText(findTestObject('Page_WEP  Work Requests/uppercost4'), '10000')

WebUI.setText(findTestObject('Page_WEP  Work Requests/approvalComment4'), 'Automated Bulk Approval')

WebUI.click(findTestObject('Page_WEP  Work Requests/approvalSUBMIT'))

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/Successfully approved1'), 'Successfully approved')

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/Successfully approved2'), 'Successfully approved')

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/Successfully approved3'), 'Successfully approved')

WebUI.verifyElementText(findTestObject('Page_WEP  Work Requests/Successfully approved4'), 'Successfully approved')

WebUI.click(findTestObject('Object Repository/Page_WEP  Work Requests/button_FINISH'))

