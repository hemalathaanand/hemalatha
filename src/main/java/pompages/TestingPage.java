package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage {
// Declaration
	@FindBy(xpath="")
	private WebElement pageHeader;
	
	@FindBy(xpath="")
	private WebElement seleniumTraningImage;
	
	@FindBy(xpath="")
	private WebElement cartArea;
	
	@FindBy(xpath="")
	private WebElement faceBookIcon;
	
	public WebElement getCartArea() {
		return cartArea;
	}
	
	}

}
