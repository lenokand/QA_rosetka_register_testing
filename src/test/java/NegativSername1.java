import org.testng.annotations.Test;

import static xpath.Xpath.*;

public class NegativSername1 extends Methods{
    @Test(description = "first test")
    public static void FirstTest() throws InterruptedException {
        ClickButton(ButonPeople);
        ClickButton(ButonRegister);
        SendKeys(InputName, "Маша");
        SendKeys(InputSurname, "Ivanova");
        SendKeys(InputPhone, "0951234567");
        SendKeys(InputEmail, randomEmail());
        SendKeys(InputPassword, "Qwerty123");
        ClickButton(ButonSubmit);
        AssertForTxt(ErrorSernameTXT, "Введіть своє прізвище кирилицею");
        WaitLoadPage(3000);
    }
}
