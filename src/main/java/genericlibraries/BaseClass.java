package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import pompages.HomePage;  

public class BaseClass {
	protected WebDriverUtility Web;   //Baseclass all the test script should extend to this Baseclass
	protected PropertyFileUtility Property;
	protected ExcelUtility excel;
	protected JavaUtility jUtil;
	protected WebDriver driver;
	protected SkillraryDemoApp demoApp;
	protected SeleniumTraningPage selenium;
	protected HomePage home;
	protected TestingPage testing;
	protected ContactUsPage contact;
	//@BeforeSuit
	//@BeforeTest
	@BeforeClass
	public void classConfiguration() {
	Web = new WebDriverUtility();
	property = new  PropertyFileUtility();
    excel = new  ExcelUtility();
    jUtil = new JavaUtility();
    
    Property.propertyConfig(IConstantPath.PROPERTIES_PATH);
    String browser = Property.fetchProperty("browser");
    String url=Property.fetchProperty("url");
    long time = Long.
	}
	@BeforeMethod
	
	@AfterMethod
	@AfterClass
	public void classTearDown() {
		Web.quitBrowser(); 
	}
	//@AfterTest
	//@AfterSuit
	
}
