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

WebUI.click(findTestObject('Object Repository/Company Setup/Track Leave Early/div_Access Existing Account'))

WebUI.setText(findTestObject('Object Repository/Company Setup/Track Leave Early/input_Stay Signed In_email'), 'devanshi@gravitycentral.ca')

WebUI.setEncryptedText(findTestObject('Object Repository/Company Setup/Track Leave Early/input_Stay Signed In_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Company Setup/Track Leave Early/button_Sign-In'))

WebUI.click(findTestObject('Object Repository/Company Setup/Track Leave Early/div_Employee Setup'))

WebUI.click(findTestObject('Object Repository/Company Setup/Track Leave Early/div_Company Setup'))

WebUI.click(findTestObject('Object Repository/Company Setup/Track Leave Early/span_Mins_slider round'))

WebUI.click(findTestObject('Object Repository/Company Setup/Track Leave Early/span_Mins_slider round'))

WebUI.click(findTestObject('Object Repository/Company Setup/Track Leave Early/div_Save'))

WebUI.closeBrowser()

