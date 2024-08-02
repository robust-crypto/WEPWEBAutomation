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

WebUI.setText(findTestObject('Object Repository/Order Types Objects/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Username'), 
    'sethapreprod')

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_Anglo EA Identity  Identity/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Order Types Objects/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_Anglo EA Identity  Identity/button_Login'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  Home/i_Email Templates_nav-icon icon-layers aa-primary'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  Home/a_Work Execution'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  Home/a_Order Types'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/button_OrderType Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/select_Steelmaking CoalThungelaCopperDe Bee_a48e9c'), 
    '2BDD0384-27DC-40E1-A203-3083C0B31A30', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/select_IsiboneloZibuloGoedehoopGreensideBar_b7f9df'), 
    'EF07118F-AFAD-4038-BA08-6AC55820E38F', true)

WebUI.setText(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/input_Code_Code'), '12345')

WebUI.setText(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/input_Description_Description'), 
    'Order Type Auto Test')

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/button_Save'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/button_Back to List'))

WebUI.setText(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/input_Search_SearchValue'), 
    'Order Type Auto Test')

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/button_Search'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/i_Modified Date_icons font-1xl d-block mt-1_a3c5f0'))

WebUI.setText(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/input_Description_Description'), 
    'Order Type Auto Test Edit')

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/button_Save'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/button_Back to List'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/i_Modified Date_icons font-1xl d-block mt-1_c32464'))

WebUI.click(findTestObject('Object Repository/Order Types Objects/Page_WEP  OrderType List Title/button_OK'))

WebUI.closeBrowser()

