import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void cashbackBelowBoundary() {
        int actual = service.remain(900);
        int expected = 100;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void cashbackBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void cashbackAboveBoundary() {
        int actual = service.remain(1100);
        int expected = 900;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void cashbackZeroAmount() {
        int actual = service.remain(0);
        int expected = 1000;
        org.junit.Assert.assertEquals(expected, actual);
    }
}
