package com.iapps.apple.dmusti.selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppleConnectTest {

	@Test
	public void test1() {
		System.out.println("test");
		WebDriver driver;	
        System.setProperty("webdriver.chrome.driver","/Users/dakshin/softwares/webdrivers/chromedriver/chromedriver");					
		driver=new ChromeDriver();        
		
		Cookie cookie1 = new Cookie("JSESSIONID", "129A62A495296447415CC6A5AE0260A5");
		Cookie cookie2 = new Cookie("JSESSIONID", "042C96FF65A6FB2CF963B9375793DFE3");
		Cookie cookie3 = new Cookie("acack-uat","DAWTKNV2d9e6451646376b60b3f72efcf8a59f134592de7d4bc3af6283f9249152b6a6474895447e8760b2c8b330e13aee230d8db55d1c718c08165d100c0f6798cc2240984bcf9f375905e5de7a6eeaa370b1889c3dbf8c1bf9c6e4232f918389ae6f039327e1b0663e0379c4dc662b31fa91b860bd026115a1053099c27f3ad04785d42e86331aa4283b7ae7b79712b9a699af3fe0463878c74e3ded04e2d55f03139514cc9b4cc473e5d1a2ca93b2d13f2555012c0ed9089b3f4a417152db40ee4308e33ef61743bbc2207aeda485cd8cb3b1d41cdf3f73f8397941aef2571259cb8b425306add991a2e944d2217305ef944e68c338c5ac6d46f7a2c6b4be12b689914aeb0517f1bff7e007fc2cd77cac4b1532336537636261623162396439393639326339343566366664613732386461396261396536356565SRVTV2");
		Cookie cookie4 = new Cookie("acn01-uat","1Jyc8KgOwMXdU0UqODrtuwAHSVqQj1GM");
		Cookie cookie5 = new Cookie("DS_PERSON_ID","990000000262179444");
		Cookie cookie6 = new Cookie("acsso", "DAWTKNV2d9e6451646376b60b3f72efcf8a59f134592de7d4bc3af6283f9249152b6a6474895447e8760b2c8b330e13aee230d8db55d1c718c08165d100c0f6798cc2240984bcf9f375905e5de7a6eeaa370b1889c3dbf8c1bf9c6e4232f918389ae6f039327e1b0663e0379c4dc662b31fa91b860bd026115a1053099c27f3ad04785d42e86331aa4283b7ae7b79712b9a699af3fe0463878c74e3ded04e2d55f03139514cc9b4cc473e5d1a2ca93b2d13f2555012c0ed9089b3f4a417152db40ee4308e33ef61743bbc2207aeda485cd8cb3b1d41cdf3f73f8397941aef2571259cb8b425306add991a2e944d2217305ef944e68c338c5ac6d46f7a2c6b4be12b689914aeb0517f1bff7e007fc2cd77cac4b1532336537636261623162396439393639326339343566366664613732386461396261396536356565SRVTV2");
		
		
		try {
			driver.get("https://accessmanager-uat1.corp.apple.com/");
			driver.manage().addCookie(cookie1);
			driver.manage().addCookie(cookie2);
			driver.manage().addCookie(cookie3);
			driver.manage().addCookie(cookie4);
			driver.manage().addCookie(cookie5);
			driver.manage().addCookie(cookie6);
			
			driver.get("https://accessmanager-uat1.corp.apple.com/");
			
			Thread.sleep(60000);
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
		
	}
}
