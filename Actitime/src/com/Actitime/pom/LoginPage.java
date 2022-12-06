package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy (name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	public LoginPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUntbx() {
		untbx.sendKeys("admin");
		return untbx;
	}
	public void setUntbx(WebElement untbx) {
		this.untbx = untbx;
	}
	public WebElement getPwtbx() {
		return pwtbx;
	}
	public void setPwtbx(WebElement pwtbx) {
		this.pwtbx = pwtbx;
	}
	public WebElement getLgbtn() {
		return lgbtn;
	}
	public void setLgbtn(WebElement lgbtn) {
		this.lgbtn = lgbtn;
	}

	//generic method
	public void logintoActitime(String un,String pw)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
		
	}
}
