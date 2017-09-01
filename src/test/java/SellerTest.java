import com.dpinchuk.models.Seller;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.Assert;
import org.junit.Test;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class SellerTest {

    int sellerId = 1;
    String sellerName = "TestName";
    String sellerLastname = "TestLastname";
    Seller seller = new Seller(this.sellerId, this.sellerName, this.sellerLastname);

    int idP = 1;
    String nameP = "TestName";
    String lastnameP = "TestLastname";

    int idN = 2;
    String nameN = "FaketName";
    String lastnameN = "FakeLastname";

    private Integer[] idArrayNegative = {null, 0};

    @Test
    public void testSellerPositive() {
        Assert.assertEquals(this.idP, this.seller.getSellerId());
        Assert.assertEquals(this.nameP, this.seller.getSellerName());
        Assert.assertEquals(this.lastnameP, this.seller.getSellerLastname());
    }

    @Test
    public void testSellerNegative() {
        Assert.assertNotEquals(this.idN, this.seller.getSellerId());
        Assert.assertNotEquals(this.nameN, this.seller.getSellerName());
        Assert.assertNotEquals(this.lastnameN, this.seller.getSellerLastname());
    }

    @Test(expected = NullPointerException.class)
    public void testSellerNumberFormatExceptionNegative() {
        for (int id : idArrayNegative) {
            new Seller(id, this.sellerName, this.sellerLastname);
        }
    }

}