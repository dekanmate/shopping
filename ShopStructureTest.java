import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.MethodOrderer.*;
import check.*;

@TestMethodOrder(OrderAnnotation.class)
public class ShopStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("shop.Shop")
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                 ;
    }

    @Test @DisabledIf(notApplicable) @Order(1_00)
    public void fieldProductToCount() {
        it.hasField("productToCount: Map of shop.products.Product to Integer")
          .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE);
    }

    @Test @DisabledIf(notApplicable) @Order(2_00)
    public void constructor() {
        it.hasConstructor(withParams("products: vararg of shop.products.Product"))
          .thatIs(VISIBLE_TO_ALL);
    }

    @Test @DisabledIf(notApplicable) @Order(3_00)
    public void methodStockProduct01() {
        it.hasMethod("stockProduct", withParams("product: shop.products.Product"))
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_NONE)
          .thatReturnsNothing();
    }

    @Test @DisabledIf(notApplicable) @Order(3_01)
    public void methodHasProduct02() {
        it.hasMethod("hasProduct", withParams("product: shop.products.Product"))
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturns("boolean");
    }

    @Test @DisabledIf(notApplicable) @Order(3_02)
    public void methodRemoveProductFromShelf03() {
        it.hasMethod("removeProductFromShelf", withParams("product: shop.products.Product"))
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturnsNothing();
    }

    @Test @DisabledIf(notApplicable)
    public void text() {
        it.has(TEXTUAL_REPRESENTATION);
    }

}

