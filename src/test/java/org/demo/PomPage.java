package org.demo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PomPage extends Base {
	public PomPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "fromPort")
	private List<WebElement> dept;
	@FindBy(name = "toPort")
	private List<WebElement> dest;
	@FindAll({ @FindBy(name = "fromPort"), @FindBy(name = "toPort") })
	private List<WebElement> depatureCity;
	@FindBys({ @FindBy(xpath = "(//select[@class='form-inline'])[1]"),
			@FindBy(xpath = "(//select[@class='form-inline'])[2]") })
	private List<WebElement> depature;

	public List<WebElement> getDept() {
		return dept;
	}

	public List<WebElement> getDest() {
		return dest;
	}

	public List<WebElement> getDepatureCity() {
		return depatureCity;
	}

	public List<WebElement> getDepature() {
		return depature;
	}

}
