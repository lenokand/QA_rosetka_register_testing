import org.testng.annotations.Test;

import static xpath.Xpath.*;

public class NegativPhone2 extends Methods{
    @Test(description = "first test")
    public static void FirstTest() throws InterruptedException {
        ClickButton(ButonPeople);
        ClickButton(ButonRegister);
        SendKeys(InputName, "Маша");
        SendKeys(InputSurname, "Иванова");
        SendKeys(InputPhone, "");
        SendKeys(InputEmail, randomEmail());
        SendKeys(InputPassword, "Qwerty123");
        ClickButton(ButonSubmit);
        AssertForTxt(ErrorPhoneTXT, "Введіть номер мобільного телефону");
        WaitLoadPage(3000);
    }
}
