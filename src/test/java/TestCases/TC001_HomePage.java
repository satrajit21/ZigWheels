package TestCases;

import java.io.IOException;

import org.testng.annotations.*;

import TestBase.BaseClass;
import pageobjects.HomePage;

public class TC001_HomePage extends BaseClass {
	public HomePage hp;
	@Test(priority=1,groups= {"Master","Sanity"})
	void test1() throws IOException {
		 hp=new HomePage(driver);
		hp.verify_title();
		hp.handleloginpopup();
	}
	@Test(priority=9,groups= {"Master","Sanity"})
	void test2() throws IOException, InterruptedException {
		hp=new HomePage(driver);
		hp.Login();
		hp.captureerrormessage();
	}
	@Test(priority=2,groups= {"Master","Regression"})
	void test3() throws IOException, InterruptedException {
		hp=new HomePage(driver);
		//driver.close();
		hp.UsedCarsCity();
	}
	
	@Test(priority=5,groups= {"Master","Regression"})
	void test4() throws IOException, InterruptedException {
		hp=new HomePage(driver);
		hp.NewBikes();
	}
}
