import com.dpinchuk.models.Product;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.Assert;
import org.junit.Test;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductTest {

    int productId = 1;
    String productName = "TestProduct";
    int productStartPrice = 1000;
    int productSalePrice = 0;
    int idSeller = 1;
    Product product = new Product(this.productId, this.productName, this.productStartPrice, this.productSalePrice, this.idSeller);

    int idP = 1;
    String nameP = "TestProduct";
    int pPriceP = 1000;
    int sPriceP = 0;
    int sIdP = 1;

    int idN = 2;
    String nameN = "FakeProduct";
    int pPriceN = 1001;
    int sPriceN = 1;
    int sIdN = 2;

    private Integer[] idArrayNegative = {null};

    @Test
    public void testProductPositive() {
        Assert.assertEquals(this.idP, this.product.getProductId());
        Assert.assertEquals(this.nameP, this.product.getProductName());
        Assert.assertEquals(this.pPriceP, this.product.getProductStartPrice());
        Assert.assertEquals(this.sPriceP, this.product.getProductSalePrice());
        Assert.assertEquals(this.sIdP, this.product.getIdSeller());
    }

    @Test
    public void testProductNegative() {
        Assert.assertNotEquals(this.idN, this.product.getProductId());
        Assert.assertNotEquals(this.nameN, this.product.getProductName());
        Assert.assertNotEquals(this.pPriceN, this.product.getProductStartPrice());
        Assert.assertNotEquals(this.sPriceN, this.product.getProductSalePrice());
        Assert.assertNotEquals(this.sIdN, this.product.getIdSeller());
    }

    @Test(expected = NullPointerException.class)
    public void testBuyerNumberFormatExceptionNegative() {
        for (int number : idArrayNegative) {
            new Product(number, this.productName, this.productStartPrice, this.productSalePrice, this.idSeller);
            new Product(this.productId, this.productName, number, this.productSalePrice, this.idSeller);
            new Product(this.productId, this.productName, this.productStartPrice, number, this.idSeller);
            new Product(this.productId, this.productName, this.productStartPrice, this.productSalePrice, number);
        }
    }

}