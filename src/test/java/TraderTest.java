import org.example.Account;
import org.example.Trade;
import org.example.Trader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraderTest {
    @Test
    public void testAddTrade() {
        Account account = new Account();
        Trader trader = new Trader("Majid", account);
        trader.addTrade(20,2);
        assertEquals(40,40);
    }
}
