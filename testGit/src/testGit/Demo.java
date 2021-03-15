package testGit;

import org.testng.annotations.Test;

public class Demo {
     
	
	
	@Test()
	public void m() {
		System.out.println("hello");
		
		WebDriver driver = new FirefoxDriver();
	}
	
	@Test(dependsOnMethods = "m")
	public void m1() {
		System.out.println("i am depends on m");
	}
}
