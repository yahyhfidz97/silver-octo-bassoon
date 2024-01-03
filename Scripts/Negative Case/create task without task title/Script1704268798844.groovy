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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\com.yoesuv.androidroom-v6(2.1.5)-production-release.apk', true)

Mobile.tap(findTestObject('Object Repository/negative case/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/negative case/android.widget.EditText - Task Content'), 0)

Mobile.setText(findTestObject('Object Repository/negative case/android.widget.EditText - Task Content (1)'), '1. Strength Training', 
    0)

Mobile.tap(findTestObject('Object Repository/negative case/android.widget.Button - SAVE (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/negative case/android.widget.ImageButton (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/negative case/android.widget.TextView - Title is Empty'), 'Title is Empty')

Mobile.closeApplication()
