import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import ru.netology.CashbackHackService;

public class testCashbackService {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountBelowThousand(){

        int actual = service.remain(666);

        int expected = 334;
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void amountAboveThousand(){

        int actual = service.remain(1111);

        int expected = 889;
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void amountEqualThousand(){

        int actual = service.remain(1000);

        int expected = 0;
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void amountNull(){

        int actual = service.remain(0);

        int expected = 1000;
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void amountBelowZero(){

        int actual = service.remain(-100);

        int expected = 1100;
        Assert.assertEquals(actual,expected);

    }

}
