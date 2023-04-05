package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericlibraries.WebDriverUtility;

public class SkillraryDemoAppPage {

	 //declaration
		@FindBy(xpath ="//div[@class='navbar-header']/a")
		private WebElement pageHeader;

		
		@FindBy(id="course")
		private WebElement courseTab;
		
		
		@FindBy(xpath ="/span/a[text()="selenium")
		private WebElement seleniumTrainingLink;
		
		@FindBy(name ="")
		private WebElement categoryDropdown;
		
		@FindBy(xpath ="")
		private WebElement contactUsLink;
		
		//initialization
		public SkillraryDemoAppPage(WebDriver driver) {
			pageFactory.initElements(driver,this);
		}
		
		//utilization
		/**
		 * this method return page header text
		 * @return
		 */
		public String getPageHeader() {
			return pageHeader.getText();
		}
		public void mouseHoverToCourse(WebDriverUtility web) {
		  web.mouseHover(courseTab);
		  
		}
		public void clickSeleniumTraning() {
			seleniumTraningLink.click();
		}
		
		public void selectCategory(WebDriverUtility web,int index) {
			web.dropdown(categoryDropdown,index);
		}
		
		public void clickContactUs() {
			contactUsLink.click();
		}
		}
	}

}
