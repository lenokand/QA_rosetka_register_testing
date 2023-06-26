import org.testng.annotations.Test;

import java.awt.*;

import static xpath.Xpath.*;

public class Negativ2 extends Methods{
    @Test(description = "second test")
    public static void SecondTest() throws InterruptedException, AWTException {
        ClickButton(ButonPeople);
        ClickButton(ButonRegister);
        SendKeys(InputName, "11111");
        SendKeys(InputSurname, "Иванова");
        SendKeys(InputPhone, "0951234567");
        SendKeys(InputEmail, randomEmail());
        SendKeys(InputPassword, "Qwerty123");
        ClickButton(ButonSubmit);
        AssertForTxt(ErrorNameTXT, "Введіть своє ім'я кирилицею");



        WaitLoadPage(3000);
    }
}
