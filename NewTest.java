package demo.demo_browser;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.POM_Login;
import ObjectRepository.POM_Logout;

/**
 * Unit test for simple App.
 */
public class NewTest 
{
	WebDriver driver;
    /**
     * Rigorous Test :-)
     * @throws IOException 
     */
    @Test(priority=1)
    public void validlogin() throws IOException
    {
       browser_intiate br=new browser_intiate();
       driver=br.browser_init();
       POM_Login or=new POM_Login(driver);
       or.username("tomsmith");
       or.password("SuperSecretPassword!");
       or.click();
    }
    @Test(priority=2)
    public void logout()
    {
    	POM_Logout lo=new POM_Logout(driver);
    	lo.logout();
    }
}
