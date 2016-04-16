import smokee.SmokeTest;
import smokee.SmokeTestContext;
import smokee.TestResult;
import smokee.defaultartifacts.DefaultGiven;
import smokee.defaultartifacts.DefaultSmokeTest;
import smokee.defaultartifacts.DefaultThen;
import smokee.defaultartifacts.DefaultWhen;
import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by peez on 02.02.2016.
 */
public class SmokeTestTest {
    @Test
    public void test() {
        DefaultGiven given = new DefaultGiven() {
            @Override
            public Map<String, Object> given(SmokeTestContext context) {
                Map<String, Object> result = new HashMap<>();
                result.put("a", "aa");
                return result;
            }
        };

        DefaultWhen when = new DefaultWhen() {
            @Override
            public Map<String, Object> when(SmokeTestContext context, Map<String, Object> given) {
                Map<String, Object> result = new HashMap<>();
                result.put("b", "bb");
                return result;
            }
        };

        DefaultThen then = new DefaultThen() {
            @Override
            public TestResult then(SmokeTestContext context, Map<String, Object> given, Map<String, Object> when) {

                TestResult result = new TestResult(false, "a:" + given.get("a") + ", b:" + when.get("b"));
                return result;
            }
        };

        DefaultSmokeTest test = new DefaultSmokeTest()
                .given(given)
                .when(when)
                .then(then)
                .execute();


        Assert.assertTrue(test.getResult().getMessage(), test.getResult().isPassed());
    }
}
