package NextGen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

public static void main(String[] args) {

		// invoking the Browser
	   // ChromeDriver method
			
			WebDriver driver = new ChromeDriver();
			driver.get("https:www.uber.com");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().getImplicitWaitTimeout();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			// basic array program
			
			String[] name = {"Manish" , "Shubham" , "rahul" };
			for(int i =0; i< name.length; i++) {
				System.out.println(name[i]);
			}
			
			for ( String s:name) {
				System.out.println(s+" ");
			}
			
			
			// Check this array has multiple of two
			
			int[] arr1 = {2,4,6,10,12,15,16,17};
			for(int i=0; i<arr1.length; i++ ) {
				
				if(arr1[i] % 2 ==0) {
					System.out.println(arr1[i]);
					
				}
				else
				{
					System.out.println(arr1[i] +"this is excluded");
				}
			}
		
			
			
		}

	}


