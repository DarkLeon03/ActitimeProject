package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id= "logoutLink")
	private WebElement lgoutlink;
	@FindBy(xpath= "//div[.='Tasks']")
	private WebElement tasklnk;
	@FindBy(xpath= "//div[.='Reports']")
	private WebElement reportlnk;
	@FindBy(xpath= "//div[.='Users']")
	private WebElement userlnk;
	
	public  HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	
	
	public WebElement getLgoutlink() {
		return lgoutlink;
	}



	public WebElement getTasklnk() {
		return tasklnk;
	}



	public WebElement getReportlnk() {
		return reportlnk;
	}



	public WebElement getUserlnk() {
		return userlnk;
	}
	

	public void logout()
	{
		lgoutlink.click();
	}
	
	public void report() {
		reportlnk.click();
	}
	
	public void taskPage() {
		tasklnk.click();
	}



	
	
}
