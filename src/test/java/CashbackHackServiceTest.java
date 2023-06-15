import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void cashbackBelowBoundary() {
        int actual = service.remain(900);
        int expected = 100;
        org.testng.AssertJUnit.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void cashbackBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        org.testng.AssertJUnit.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void cashbackAboveBoundary() {
        int actual = service.remain(1100);
        int expected = 900;
        org.testng.AssertJUnit.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void cashbackZeroAmount() {
        int actual = service.remain(0);
        int expected = 1000;
        org.testng.AssertJUnit.assertEquals(expected, actual);
    }
}
