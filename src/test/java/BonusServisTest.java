import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServisTest {
    @Test
    public void calculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        //System.out.println("1) " + expected + " == ? == " + actual );
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateForRegisteredAndUOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        //System.out.println("1) " + expected + " == ? == " + actual );
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateForNoRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        //System.out.println("1) " + expected + " == ? == " + actual );
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateForNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        //System.out.println("1) " + expected + " == ? == " + actual );
        Assertions.assertEquals(expected, actual);
    }

}
