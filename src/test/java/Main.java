import org.testng.annotations.Test;

import static xpath.Xpath.ButonPeople;
import static xpath.Xpath.ButonRegister;
import static xpath.Xpath.InputName;
import static xpath.Xpath.InputSurname;
import static xpath.Xpath.InputPhone;
import static xpath.Xpath.InputEmail;
import static xpath.Xpath.InputPassword;
import static xpath.Xpath.ButonSubmit;

public class Main extends Methods{
    @Test(description = "first test")
    public static void FirstTest() throws InterruptedException {
        ClickButton(ButonPeople);
        ClickButton(ButonRegister);
        SendKeys(InputName, "Маша");
        SendKeys(InputSurname, "Иванова");
        SendKeys(InputPhone, "0951234567");
        SendKeys(InputEmail, "test@gmail.com");
        SendKeys(InputPassword, "Qwerty123");
        ClickButton(ButonSubmit);
        WaitLoadPage(3000);
    }
}
