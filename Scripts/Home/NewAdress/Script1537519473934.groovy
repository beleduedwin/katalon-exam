import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_My account - My Store/span_My addresses'))

WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/span_Add a new address (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__address1 (1)'), adress1)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input_Address (Line 2)_address (1)'), adress2)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__city (1)'), city)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Address - My Store/select_-AlabamaAlaskaArizonaAr (1)'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__postcode (1)'), postcode)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone (1)'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone_mobile (1)'), phone_mobile)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/textarea_Additional informatio (1)'), 'salut')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__alias'), alias)

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/span_Save (1)'))

