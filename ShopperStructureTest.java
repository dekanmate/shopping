import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.MethodOrderer.*;
import check.*;
import shop.products.util.ShoppingException;

@TestMethodOrder(OrderAnnotation.class)
public class ShopperStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theInterface("customer.util.Shopper")
                 .thatIs(NOT_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                 ;
    }

    @Test @DisabledIf(notApplicable) @Order(3_00)
    public void methodEnterShop01() {
        it.hasMethod("enterShop", withParams("shop: shop.Shop"))
          .thatIs(NOT_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatCanRaise("shop.products.util.ShoppingException")
          .thatReturnsNothing();
          
    }

    @Test @DisabledIf(notApplicable) @Order(3_01)
    public void methodShop02() {
        it.hasMethod("shop", withParams("product: shop.products.Product"))
          .thatIs(NOT_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturnsNothing();
    }

}

