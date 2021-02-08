package org.demo;

public class Automated extends Base {
	public static void main(String[] args) {
		getChromeDrive();
		loadUrl("https://blazedemo.com/");
		PomPage page = new PomPage();
		System.out.println("1st DropDown");
		for (int i = 0; i < page.getDept().size(); i++) {
			System.out.println(page.getDept().get(i).getText());
		}
		System.out.println("2nd DropDown");
		for (int i = 0; i < page.getDest().size(); i++) {
			System.out.println(page.getDest().get(i).getText());
		}
		System.out.println("Both DropDown using FindAll");
		for (int i = 0; i < page.getDepatureCity().size(); i++) {
			System.out.println(page.getDepatureCity().get(i).getText());
		}
		System.out.println("Both DropDown using FindBys");
		for (int i = 0; i < page.getDepature().size(); i++) {
			System.out.println(page.getDepature().get(i).getText());
		}
		shutDown();
	}

}
