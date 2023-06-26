import org.testng.annotations.Test;

import static xpath.Xpath.*;

public class NegativEmail1 extends Methods{
    @Test(description = "first test")
    public static void FirstTest() throws InterruptedException {
        ClickButton(ButonPeople);
        ClickButton(ButonRegister);
        SendKeys(InputName, "Маша");
        SendKeys(InputSurname, "Иванова");
        SendKeys(InputPhone, "0951234567");
        SendKeys(InputEmail, randomEmailnodap());
        SendKeys(InputPassword, "Qwerty123");
        ClickButton(ButonSubmit);
        AssertForTxt(ErrorEmailTXT, "Введіть свою ел. пошту");
        WaitLoadPage(3000);
    }
}
