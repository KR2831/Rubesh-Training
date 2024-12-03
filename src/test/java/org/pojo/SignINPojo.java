package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignINPojo extends BaseClass{
	
	public SignINPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAccount;
	
	@FindBy(xpath= "(//input[@type='text'])[1]")
	private WebElement firstNameTextBox;
	
	@FindBy(name = "lastname")
	private WebElement secondNameTextBox;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileorEmailTextBox;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newPassword;

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getSecondNameTextBox() {
		return secondNameTextBox;
	}

	public WebElement getMobileorEmailTextBox() {
		return mobileorEmailTextBox;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}
	

}
