import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.MethodOrderer.*;
import check.*;

@TestMethodOrder(OrderAnnotation.class)
public class ProductStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("shop.products.Product")
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                 ;
    }

    @Test @DisabledIf(notApplicable) @Order(1_00)
    public void fieldProductType() {
        it.hasField("productType: shop.products.util.ProductType")
          .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE);
    }

    @Test @DisabledIf(notApplicable) @Order(1_01)
    public void fieldPrice() {
        it.hasField("price: int")
          .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE);
    }

    @Test @DisabledIf(notApplicable) @Order(2_00)
    public void constructor() {
        it.hasConstructor(withParams("productType: shop.products.util.ProductType", "price: int"))
          .thatIs(VISIBLE_TO_ALL);
    }

    @Test @DisabledIf(notApplicable) @Order(3_00)
    public void methodGetProductType01() {
        it.hasMethod("getProductType", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("shop.products.util.ProductType");
    }

    @Test @DisabledIf(notApplicable) @Order(3_01)
    public void methodGetPrice02() {
        it.hasMethod("getPrice", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("int");
    }

    @Test @DisabledIf(notApplicable)
    public void eq() {
        it.has(EQUALITY_CHECK);
    }

}

