import com.dpinchuk.models.Bid;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.Assert;
import org.junit.Test;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class BidTest {

    int bidId = 1;
    int bidStep = 1000;
    int bidCurrent = 10000;
    int buyerId = 1;
    int productId = 1;
    Bid bid = new Bid(this.bidId, this.bidStep, this.bidCurrent, this.buyerId, this.productId);

    int idP = 1;
    int stepP = 1000;
    int currentP = 10000;
    int bIdP = 1;
    int pIdP = 1;

    int idN = 2;
    int stepN = 2000;
    int currentN = 30000;
    int bIdN = 2;
    int pIdN = 2;

    private Integer[] idArrayNegative = {null};

    @Test
    public void testProductPositive() {
        Assert.assertEquals(this.idP, this.bid.getBidId());
        Assert.assertEquals(this.stepP, this.bid.getBidStep());
        Assert.assertEquals(this.currentP, this.bid.getBidCurrent());
        Assert.assertEquals(this.bIdP, this.bid.getBuyerId());
        Assert.assertEquals(this.pIdP, this.bid.getProductId());
    }

    @Test
    public void testProductNegative() {
        Assert.assertNotEquals(this.idN, this.bid.getBidId());
        Assert.assertNotEquals(this.stepN, this.bid.getBidStep());
        Assert.assertNotEquals(this.currentN, this.bid.getBidCurrent());
        Assert.assertNotEquals(this.bIdN, this.bid.getBuyerId());
        Assert.assertNotEquals(this.pIdN, this.bid.getProductId());
    }

    @Test(expected = NullPointerException.class)
    public void testBuyerNumberFormatExceptionNegative() {
        for (int number : idArrayNegative) {
            new Bid(number, this.bidStep, this.bidCurrent, this.buyerId, this.productId);
            new Bid(this.bidId, number, this.bidCurrent, this.buyerId, this.productId);
            new Bid(this.bidId, this.bidStep, number, this.buyerId, this.productId);
            new Bid(this.bidId, this.bidStep, this.bidCurrent, number, this.productId);
            new Bid(this.bidId, this.bidStep, this.bidCurrent, this.buyerId, number);
        }
    }

}