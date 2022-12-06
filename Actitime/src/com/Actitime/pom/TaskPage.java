package com.Actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.Generic.ReadDataFromExcel;

public class TaskPage {

	
	@FindBy(xpath="(//div[@class='title ellipsis'])[1]")
	private WebElement addnew;
	@FindBy(xpath="(//div[@class='item createNewCustomer'])[1]")
	private WebElement newcustomer;
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder newNameField inputNameField'])[1]")
	private WebElement custname;
	
	@FindBy(xpath="(//div[contains(text(),'Create Customer')])[1]")
	private WebElement cretcust;
	
	public TaskPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddnew() {
		return addnew;
	}
	
	
	public WebElement getNewcustomer() {
		return newcustomer;
	}
	
	
	
	public WebElement getCustname() {
		return custname;
	}
	public WebElement getCretcust() {
		return cretcust;
	}
	public void clickonAdd() throws EncryptedDocumentException, IOException
	{
		ReadDataFromExcel r = new ReadDataFromExcel();
		String custname1 = r.readdataFromExcelFile("Sheet1", 3, 1);
		addnew.click();
		newcustomer.click();
		custname.sendKeys(custname1);
		cretcust.click();
		
	}
	
	
}
