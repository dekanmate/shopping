import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import shop.ShopTest;

@SelectClasses({
	ShopPart2TestSuite.StructuralTests.class,
	ShopPart2TestSuite.FunctionalTests.class,
})
@Suite public class ShopPart2TestSuite {
    @SelectClasses({
    	ShopStructureTest.class,
        ShopTestStructureTest.class,
    })
    @Suite public static class StructuralTests {}

    @SelectClasses({
    	ShopTest.class,
    })
    @Suite public static class FunctionalTests {}
}