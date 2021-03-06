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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin-stag-amazon.picnyk.com/')

WebUI.click(findTestObject('Access Existing Account/div_Access Existing Account'))

WebUI.sendKeys(findTestObject('Access Existing Account/input_Stay Signed In_email'), 'devanshi@gravitycentral.ca')

WebUI.sendKeys(findTestObject('Access Existing Account/input_Stay Signed In_password'), '1234')

WebUI.verifyElementVisible(findTestObject('Access Existing Account/div_Stay Signed In'))

WebUI.click(findTestObject('Access Existing Account/button_Sign-In'))

WebUI.click(findTestObject('Employee Setup/div_Employee Setup'))

WebUI.sendKeys(findTestObject('Employee Setup/input_Save  Delete_name'), 'This is Automated Name')

WebUI.sendKeys(findTestObject('Employee Setup/input_Save  Delete_manager'), 'thisisautomatedmanager@gmail.com')

WebUI.verifyElementVisible(findTestObject('Employee Setup/th_Work Days'))

WebUI.verifyElementVisible(findTestObject('Employee Setup/th_Start and End Workday'))

WebUI.click(findTestObject('Employee Setup/i_Sat_fas fa-save disabled'))

WebUI.acceptAlert()

WebUI.closeBrowser()

