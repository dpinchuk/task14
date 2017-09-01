import com.dpinchuk.models.Buyer;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.Assert;
import org.junit.Test;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class BuyerTest {

    int buyerId = 1;
    String buyerName = "TestName";
    String buyerLastname = "TestLastname";
    Buyer buyer = new Buyer(this.buyerId, this.buyerName, this.buyerLastname);

    int idP = 1;
    String nameP = "TestName";
    String lastnameP = "TestLastname";

    int idN = 2;
    String nameN = "FaketName";
    String lastnameN = "FakeLastname";

    Integer[] idArrayNegative = {null, 0};

    @Test
    public void testBuyerPositive() {
        Assert.assertEquals(this.idP, this.buyer.getBuyerId());
        Assert.assertEquals(this.nameP, this.buyer.getBuyerName());
        Assert.assertEquals(this.lastnameP, this.buyer.getBuyerLastname());
    }

    @Test
    public void testBuyerNegative() {
        Assert.assertNotEquals(this.idN, this.buyer.getBuyerId());
        Assert.assertNotEquals(this.nameN, this.buyer.getBuyerName());
        Assert.assertNotEquals(this.lastnameN, this.buyer.getBuyerLastname());
    }

    @Test(expected = NullPointerException.class)
    public void testBuyerNumberFormatExceptionNegative() {
        for (int id : idArrayNegative) {
            new Buyer(id, this.buyerName, this.buyerLastname);
        }
    }

}