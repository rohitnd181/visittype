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

WebUI.click(findTestObject('Create Visit type/a_view_stream     Visit Types'))

WebUI.verifyElementPresent(findTestObject('All nav buttons/List button link'), 0)

WebUI.verifyElementText(findTestObject('All nav buttons/List button text'), findTestData('All nav buttons text').getValue(
        2, 1))

WebUI.verifyElementPresent(findTestObject('All nav buttons/Visit Types Questions button link'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Visit Types edit pencil icon for Questions button'), 0)

WebUI.verifyElementText(findTestObject('All nav buttons/Visit Types Questions button text'), findTestData('All nav buttons text').getValue(
        2, 2))

WebUI.click(findTestObject('All start page buttons/a_insert_chart     Analytics'))

WebUI.verifyElementPresent(findTestObject('All nav buttons/Analytics Reports buttons'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Analytics Reports trending icon'), 0)

WebUI.verifyElementText(findTestObject('All nav buttons/Analytics Reports text'), findTestData('All nav buttons text').getValue(
        2, 3))

WebUI.verifyElementPresent(findTestObject('All nav buttons/Analytics Surveys button'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Analytics Surveys thums up icon'), 0)

WebUI.verifyElementText(findTestObject('All nav buttons/Analytics Surveys text'), findTestData('All nav buttons text').getValue(
        2, 4))

WebUI.click(findTestObject('All start page buttons/a_devices     Mobi'))

WebUI.verifyElementPresent(findTestObject('All nav buttons/Mobi Appearnce Button'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Mobi Appearance colors icon'), 0)

WebUI.verifyElementText(findTestObject('All nav buttons/Mobi Appearance text'), findTestData('All nav buttons text').getValue(
        2, 5))

WebUI.click(findTestObject('All start page buttons/a_people     Team Management'))

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team mngmnt Users link'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team mngment person icon'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team Mngment Users text'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team Mngment Teams link'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team Mngment Team people icon'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team Mngment Team button text'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team mngment Insights button'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team Mngment Insights icon'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Team Mngment Insights text'), 0)

WebUI.click(findTestObject('All start page buttons/a_settings     Settings'))

WebUI.verifyElementPresent(findTestObject('All nav buttons/Settings Location button'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Settings Near me location icon'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Settings Lcation text'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Settings Account Basics button'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Settings Account Basics icon'), 0)

WebUI.verifyElementPresent(findTestObject('All nav buttons/Settings Account Basics text'), 0)

