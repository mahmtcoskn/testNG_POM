package tests.day10_TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_Priority {
    /*
    TestNG test methodlarini calistirirken standart olarak harf siralamasina bakar
    Ancak TestNG siralamayi bizim kontrol etmemize olanak tanir

    istedigimiz test method una istedigimiz onceligi prority ile tanimlayabiliriz
    Selenium test method larini priority si kucukten buyuge olacak sekilde calistirir

    priority degeri ayni olan test method lari harf sirasina gore calisir
    priority degeri degeri yazilmazsa priority=0 olarak kabul edilir

     */
    @Test (priority = -20)
    public void amazonTesti(){
        // Amazon ana sayfasına gidip, amazona gittigimizi test edelim
        Driver.getDriver().get("https://www.amazon.com/");

        // url amazon iceriyor mu test edelim
        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }
    @Test
    public void wiseTesti() throws InterruptedException {
        // wisequarter ana sayfasına gidip, wisequarter a gittigimizi test edelim
        Driver.getDriver().get("https://www.wisequarter.com/");
        // Thread.sleep(2000);
        // Driver.getDriver().navigate().refresh();

        // url wisequarter iceriyor mu test edelim
        String expectedIcerik = "wisequarter";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }
    @Test
    public void youtubeTesti(){
        // youtube ana sayfasına gidip, youtube a gittigimizi test edelim
        Driver.getDriver().get("https://www.youtube.com/");

        // url youtube iceriyor mu test edelim
        String expectedIcerik = "youtube";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }
}
