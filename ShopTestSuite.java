import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@SelectClasses({
      ShopPart1TestSuite.class
    , ShopPart2TestSuite.class
    , ShopPart3TestSuite.class
})
@Suite public class ShopTestSuite {}

