import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import shop.products.ProductTest;

@SelectClasses({
	ShopPart1TestSuite.StructuralTests.class,
	ShopPart1TestSuite.FunctionalTests.class,
})
@Suite public class ShopPart1TestSuite {
    @SelectClasses({
		ProductTypeStructureTest.class,
		ShoppingExceptionStructureTest.class,
		ProductStructureTest.class,

		ProductTestStructureTest.class,
    })
    @Suite public static class StructuralTests {}

    @SelectClasses({
        ProductTest.class,
    })
    @Suite public static class FunctionalTests {}
}