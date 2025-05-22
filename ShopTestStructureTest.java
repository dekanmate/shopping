import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.MethodOrderer.*;
import check.*;

@TestMethodOrder(OrderAnnotation.class)
public class ShopTestStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("shop.ShopTest")
                 .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                 ;
    }

    @Test @DisabledIf(notApplicable) @Order(3_00)
    public void methodTestShopHasProduct01() {
        it.hasMethod("testShopHasProduct", withParams("productType: String", "productPrice: int", "verdict: boolean"))
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturnsNothing();
    }

    @Test @DisabledIf(notApplicable) @Order(3_01)
    public void methodTestRemoveProductFromShelf02() {
        it.hasMethod("testRemoveProductFromShelf", withNoParams())
          .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
          .thatReturnsNothing();
    }
}

