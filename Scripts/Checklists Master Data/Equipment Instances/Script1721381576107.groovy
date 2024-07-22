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

WebUI.navigateToUrl('https://identity-preprod.ea.angloamerican.com/Account/Login?AppCode=Checklist-PreProd&ReturnUrl=https://checklists-preprod.ea.angloamerican.com/Account/LoginRedirect')

WebUI.setText(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/input_Checklists_Username (1)'), 'sethapreprod')

WebUI.click(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/button_Next (2)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/input_Checklists_Password (1)'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Anglo EA Identity  Identity/button_Login (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/i_Equipment_arrow (1)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/a_Equipment Instances (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/i_Results_pli-plus (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/input_Equipment number_EquipmentNumber (2)'), 
    '12345')

WebUI.setText(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/input_Description_Description (2)'), 'Equipment Instance Auto Test')

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/span_All (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/li_EQ Type Reg Test - Bulk Upload (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/span_Anglo Platinum (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/li_Anglo Platinum (2)'))

WebUI.click(findTestObject('Page_Anglo Checklists  Checklist/span_Any Business Unit Site'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/li_Unki Mine (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/a_All'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/li_ET Samu (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/button_Save (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/a_Back To List (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/input_Search_SearchValue (1)'), 'Equipment Instance Auto Test')

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/button_Search (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/i_Active_psi-pen-5 icon-sm (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/input_Description_Description (2)'), 'Equipment Instance Auto Test Edit')

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/button_Save (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/a_Back To List (2)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/i_Active_psi-recycling icon-sm (1)'))

WebUI.click(findTestObject('Object Repository/Page_Anglo Checklists  Checklist/button_OK (2)'))

WebUI.closeBrowser()

