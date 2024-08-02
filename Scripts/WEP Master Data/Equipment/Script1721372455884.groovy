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

WebUI.setText(findTestObject('Object Repository/WEP Master Data 1/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Username'), 
    'sethapreprod')

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_Anglo EA Identity  Identity/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/WEP Master Data 1/Page_Anglo EA Identity  Identity/input_Work Execution Platform_Password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_Anglo EA Identity  Identity/button_Login'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Home/i_Email Templates_nav-icon icon-layers aa-primary'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Home/a_Plants  Assets'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Home/a_Equipment'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/button_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/select_Steelmaking CoalThungelaCopperDe Bee_a48e9c'), 
    '2BDD0384-27DC-40E1-A203-3083C0B31A30', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/select_Any Company CodeR000 - Rustenburg Pl_53402a'), 
    'eb16bc86-a6b0-4f79-afed-c8cd65cc7632', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/select_Any Maintenance plantRE01 - Mogalakw_91391d'), 
    '1f4be796-ae27-476f-9026-30d3ef67eac4', true)

WebUI.setText(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/input_Functional Location_TO_FunctionalLoca_927ca6'), 
    'BU7020507-GBEQ-TO02')

WebUI.setText(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/input_Code_Code'), '12345')

WebUI.setText(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/input_Description EN_DescriptionEN'), 
    'Equipment Auto Test')

WebUI.setText(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/input_Work Centre_WorkCenterCode'), 
    'AX1')

WebUI.setText(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/input_Work Centre Plant Code_WorkCenterMain_0c3e15'), 
    'RWB0')

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/button_Save'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/button_Back to List'))

WebUI.setText(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/input_Update_SearchValue'), 'Equipment Auto Test')

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/button_Search'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/button_Modified Date_btn btn-primary btn-ic_767b9b'))

WebUI.setText(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/input_Description EN_DescriptionEN'), 
    'Equipment Auto Test Edit')

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/button_Save'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/button_Back to List'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/i_Modified Date_icons font-1xl d-block mt-1_c32464'))

WebUI.click(findTestObject('Object Repository/WEP Master Data 1/Page_WEP  Equipment/button_OK'))

WebUI.closeBrowser()

