import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.MethodOrderer.*;
import check.*;

@TestMethodOrder(OrderAnnotation.class)
public class ProductTypeStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theEnum("shop.products.util.ProductType")
                 .hasEnumElements("BREAD", "MILK", "EGGS");
    }

}

