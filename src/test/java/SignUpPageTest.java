import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpPageTest extends TestBase{

    @BeforeSuite
    public void setUpInternal(){

        super.url="https://partner.cloudrein.com//sign-up";
    }

    @Test
    public void positiveScenarioTest(){
        WebElement tag = findByXPath("//h2[@class='ant-typography StyledTypography__StyledTitle-sc-d1hytu-0 MxoCQ StyledTypography__HeadingTitle-sc-d1hytu-2 Title-sc-1n24hbd-0 StyledFormBlock__FormTitle-sc-16aqzbf-2 huyklH ndPRA bUplke']");
        Assert.assertEquals(tag.getText(),"Sign up for a 14 Day Free Trial");
    }






}
