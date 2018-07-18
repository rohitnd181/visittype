import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Daily Visit-events-off campus/a_event     Events'))

WebUI.click(findTestObject('Create Visit type/Visit Types option'))

WebUI.click(findTestObject('Create Visit type/button_Create Visit Type'))

WebUI.verifyElementPresent(findTestObject('Create Visit type/SELECT DAILY VISIT'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/EVENT SELECT'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/OFF_CAMPUS_SELECT'), 0)

WebUI.click(findTestObject('Create Visit type/SELECT DAILY VISIT'))

WebUI.click(findTestObject('Create Visit type/button_Get Started'))

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Visit Type Name'), 0)

Random x = new Random()

y = x.nextInt(10000)

visit = ('visit' + y)

WebUI.sendKeys(findTestObject('Create Visit type/input_ember2784'), visit)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Name Available'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Registrant Type'), 0)

WebUI.click(findTestObject('Create Visit type/label_Individuals'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Create Visit type/span_Registration Method'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Registration Method'), 0)

WebUI.scrollToElement(findTestObject('Create Visit type/label_Request'), 0)

WebUI.click(findTestObject('Create Visit type/label_Request'))

WebUI.scrollToElement(findTestObject('Create Visit type/span_Check In Method'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Check In Method'), 0)

WebUI.scrollToElement(findTestObject('Create Visit type/label_Automated Text Message'), 0)

WebUI.click(findTestObject('Create Visit type/label_Automated Text Message'))

WebUI.scrollToElement(findTestObject('Create Visit type/span_Ways to Meet'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Ways to Meet'), 0)

WebUI.click(findTestObject('Create Visit type/label_In Person'))

WebUI.click(findTestObject('Create Visit type/Next button'))

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Photo                   i'), 0)

WebUI.click(findTestObject('Create Visit type/button_Add Later'))

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Description'), 0)

WebUI.sendKeys(findTestObject('Create Visit type/description while creating'), findTestData('Create Visit type').getValue(2, 
        7))

WebUI.scrollToElement(findTestObject('Create Visit type/span_Close Registration On'), 0)

WebUI.verifyElementPresent(findTestObject('Create Visit type/span_Close Registration On'), 0)

WebUI.click(findTestObject('Create Visit type/label_Close Day of Visit'))

WebUI.click(findTestObject('Create Visit type/a_Next'))

not_run: WebUI.verifyElementText(findTestObject('Create Visit type/check visit type name'), GlobalVariable.null)

WebUI.verifyElementText(findTestObject('Create Visit type/check Registrent Type'), findTestData('Create Visit type').getValue(
        2, 2))

WebUI.verifyElementText(findTestObject('Create Visit type/Check Registration method', [('variable') : '']), findTestData(
        'Create Visit type').getValue(2, 3))

WebUI.verifyElementText(findTestObject('Create Visit type/Check Check in method'), findTestData('Create Visit type').getValue(
        2, 4))

WebUI.verifyElementText(findTestObject('Create Visit type/Check photo'), findTestData('Create Visit type').getValue(2, 6))

WebUI.verifyElementText(findTestObject('Create Visit type/Check Description'), findTestData('Create Visit type').getValue(
        2, 7))

WebUI.verifyElementText(findTestObject('Create Visit type/Check Close Registration'), findTestData('Create Visit type').getValue(
        2, 8))

WebUI.click(findTestObject('Create Visit type/a_Create'))

WebUI.waitForElementPresent(findTestObject('Create Visit type/Add later window'), 0)

WebUI.click(findTestObject('Create Visit type/Add Later after created'))

