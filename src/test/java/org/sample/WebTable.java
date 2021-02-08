package org.sample;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		List<WebElement> heading = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//th"));
		for (WebElement head : heading) {
			System.out.println(head.getText());
		}
		HashMap<String, ArrayList<String>> table = new HashMap<String, ArrayList<String>>();
		for (int i = 1; i < heading.size(); i++) {
			ArrayList<String> al = new ArrayList<String>();
			int j = i;
			List<WebElement> data = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr//td[" + j + "]"));
			for (WebElement datas : data) {
				al.add(datas.getText());
			}
			table.put(heading.get(i).getText(), al);
		}
		System.out.println(table);
		driver.quit();
	}
}
