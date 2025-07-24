package NextGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test01 {

	public static void main(String[] args) {
		
		//Headless Browser method
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		
		
		// invoking the Browserr
		// ChromeDriver method
		
	    //WebDriver driver = new ChromeDriver();
		driver.get("https:www.uber.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// basic array program using for loop

		String[] name = { "Manish", "Shubham", "rahul" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		for (String s : name) {
			System.out.println(s + " ");
		}

		// Check this array has multiple of two or not

		int[] arr1 = { 2, 4, 6, 10, 12, 15, 16, 17 };
		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] % 2 == 0) {
				System.out.println(arr1[i]);

			} else {
				System.out.println(arr1[i] + "this is excluded just boz value is not divisible to two");

			}
		}

		// Basic Array_list Use

		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		System.out.println(a.get(2));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("********************");

		for (String val : a) {
			System.out.println(val);
		}
		
		System.out.println("********************");
		
		// Items present in ArrayList 
		System.out.println(a.contains("Selenium"));
		
		System.out.println("********************");

	// Convert Array to Array_list 
		
		String [] name1 = {"Pranali", "Renuka", "Vaibhavi", "Kavita"};
		List<String> nameArraylist = Arrays.asList(name1);
		System.out.println(nameArraylist);
		System.out.println(nameArraylist.contains("Renuka"));
		System.out.println("*********************");
        System.out.println("Hey Manish");
	}

}
