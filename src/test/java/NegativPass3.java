import org.testng.Assert;
import org.testng.annotations.Test;

import static xpath.Xpath.*;

public class NegativPass3 extends Methods{
    @Test(description = "first test")
    public static void FirstTest() throws InterruptedException {
        ClickButton(ButonPeople);
        ClickButton(ButonRegister);
        SendKeys(InputName, "Маша");
        SendKeys(InputSurname, "Иванова");
        SendKeys(InputPhone, "0951234567");

        SendKeys(InputEmail,randomEmail() );
        SendKeys(InputPassword, "Qw123");
        ClickButton(ButonSubmit);



//        Assert.assertTrue(ErrorPassSameTXT.isDisplayed());
        Assert.assertTrue(isDisplayed(ErrorPassTXT));
//        AssertForTxt(ErrorEmailTXT, "Введіть свою ел. пошту");
        WaitLoadPage(3000);
    }
}
