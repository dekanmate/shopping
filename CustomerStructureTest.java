import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.MethodOrderer.*;
import check.*;

@TestMethodOrder(OrderAnnotation.class)
public class CustomerStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("customer.Customer", withInterface("customer.util.Shopper"))
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                 ;
    }

    @Test @DisabledIf(notApplicable) @Order(1_00)
    public void fieldName() {
        it.hasField("name: String")
          .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE);
    }

    @Test @DisabledIf(notApplicable) @Order(1_01)
    public void fieldShoppingCart() {
        it.hasField("shoppingCart: List of shop.products.Product")
          .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE);
    }

    @Test @DisabledIf(notApplicable) @Order(1_02)
    public void fieldShop() {
        it.hasField("shop: shop.Shop")
          .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE);
    }

    @Test @DisabledIf(notApplicable) @Order(2_00)
    public void constructor() {
        it.hasConstructor(withParams("name: String"))
          .thatIs(VISIBLE_TO_ALL);
    }

    @Test @DisabledIf(notApplicable) @Order(3_00)
    public void methodGetName01() {
        it.hasMethod("getName", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("String");
    }

    @Test @DisabledIf(notApplicable) @Order(3_01)
    public void methodTotalCost02() {
        it.hasMethod("totalCost", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("int");
    }

    @Test @DisabledIf(notApplicable) @Order(3_02)
    public void methodEnterShop03() {
        it.implementsMethod("enterShop");
    }

    @Test @DisabledIf(notApplicable) @Order(3_03)
    public void methodShop04() {
        it.implementsMethod("shop");
    }

}

