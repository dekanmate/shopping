import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import customer.CustomerTest;

@SelectClasses({
	ShopPart3TestSuite.StructuralTests.class,
	ShopPart3TestSuite.FunctionalTests.class,
})
@Suite public class ShopPart3TestSuite {
    @SelectClasses({
    	ShopperStructureTest.class,
        CustomerStructureTest.class,

        CustomerTestStructureTest.class,
    })
    @Suite public static class StructuralTests {}

    @SelectClasses({
    	CustomerTest.class,
    })
    @Suite public static class FunctionalTests {}
}