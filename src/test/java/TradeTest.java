import org.example.Trade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TradeTest {
    @Test
    public void testSetPrice() {
        Trade trade = new Trade("ID1","ABC",20);
        trade.setPrice(-20.42);
        double price = trade.getPrice();
        assertEquals(0,price);
    }
}
