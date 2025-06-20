package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage extends BasePage {
    @AndroidFindBy(id = "com.android.contacts:id/name_edit_text")
    private MobileElement nameField;

    @AndroidFindBy(id = "com.android.contacts:id/lastname_edit_text")
    private MobileElement lastNameField;

    @AndroidFindBy(id = "com.android.contacts:id/phone_edit_text")
    private MobileElement phoneField;

    @AndroidFindBy(id = "com.android.contacts:id/email_edit_text")
    private MobileElement emailField;

    @AndroidFindBy(id = "com.android.contacts:id/editor_menu_save_button")
    private MobileElement saveButton;

    public AddContactPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterContactDetails(String name, String lastName, String phone, String email) {
        nameField.sendKeys(name);
        lastNameField.sendKeys(lastName);
        phoneField.sendKeys(phone);
        emailField.sendKeys(email);
    }

    public void saveContact() {
        saveButton.click();
    }
}