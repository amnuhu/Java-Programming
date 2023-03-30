
import org.example.BondTrade;
import org.example.FundTrade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FundTradeTest {
    @Test
    public void TestFundTrade() {
        FundTrade fundTrade = new FundTrade("ID1","ABC",20,100.0, 0.90);
        fundTrade.calcDividend();
        double dividend = fundTrade.getDividend();
        System.out.println("Dividend is  " + dividend);
        assertEquals(90.0,dividend);
    }
}

