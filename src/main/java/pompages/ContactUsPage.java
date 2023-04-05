package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class contains elements and respective business libraries of contact us page 
 * @author hemalatha
 *
 */
public class ContactUsPage {
	//declaration
	@FindBy(xpath = "//img[contains(@src,'contactus')]")
	private WebElement contactUsIcon;
	
	@FindBy(name ="name")
	private WebElement fullNameTF;
	
	@FindBy(name ="sender")
	private WebElement emailTF;
	
	@FindBy(name ="subject")
	private WebElement subjectTF;
	
	@FindBy(name = "message")
	private WebElement messageTextArea;
	
	@FindBy(xpath ="//button[text()='send us mail']")
	private WebElement sendUsMailButton;
	
	//initialization
	public ContactUsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getContactIcon() {
		return contactUsIcon;
	}
	
	/**
	 * This method is used to send contact details to skillrary
	 * @param fullname
	 * @param email
	 * @param subject
	 * @param message
	 */
	public void sendContactInfo(String fullname,String email,String subject,String message) {
		fullNameTF.sendKeys(fullname);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTextArea.sendKeys(message);
		sendUsMailButton.click();
	}
		
	}


