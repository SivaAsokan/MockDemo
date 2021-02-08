package org.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		WebElement head = driver.findElement(By.xpath("//td[text()='Taiwan']/preceding-sibling::th"));
		System.out.println(head.getText());
		ArrayList<String> al = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.xpath("//tbody[@style='margin: 0px; padding: 0px;']//tr/td[4]"));
		for (int i = 0; i <list.size(); i++) {
			al.add(list.get(i).getText());
		}
		Collections.sort(al);
		System.out.println(al.get(0));
		for (int i = 0; i <list.size(); i++) {
			if (list.get(i).getText().contains(String.valueOf(al.get(0)))) {
				int j=i+1;
				WebElement list2 = driver.findElement(By.xpath("(//tbody[@style='margin: 0px; padding: 0px;']//tr/td[4]//preceding-sibling::th)["+j+"]"));
				System.out.println(list2.getText());
			}
		}
		driver.quit();
		}


}
