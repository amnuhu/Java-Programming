
import org.example.BondTrade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BondTradeTest {
    @Test
    public void TestBondTrade() {
        BondTrade bondTrade = new BondTrade("ID1","ABC",20, 50.0, 100.00);
        bondTrade.calcDividend();
        double dividend = bondTrade.getDividend();
        assertEquals(100,dividend);
    }
}

