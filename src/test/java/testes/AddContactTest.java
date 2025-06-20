package testes;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddContactPage;
import utils.DriverManager;

public class AddContactTest {
    private AndroidDriver<MobileElement> driver;
    private AddContactPage addContactPage;

    @BeforeClass
    public void setUp() throws Exception {
        driver = DriverManager.getDriver();
        addContactPage = new AddContactPage(driver);
    }

    @Test
    public void testAddNewContact() {
        addContactPage.enterContactDetails("Teste", "Appium", "11999999999", "teste@appium.com");
        addContactPage.saveContact();
    }

    @AfterClass
    public void tearDown() {
        DriverManager.closeDriver();
    }
}