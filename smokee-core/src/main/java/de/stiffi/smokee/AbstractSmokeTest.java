package de.stiffi.smokee;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by peez on 02.02.2016.
 */
public abstract class AbstractSmokeTest {
    private Map<String, Object> context = new HashMap<>();
    private TestResult result;

    private SmokeTestHandler givenHandler;

    public <R extends AbstractSmokeTest> R context(String key, Object value) {
        context.put(key, value);
        return (R) this;
    }

    protected abstract SmokeTestHandler given();
    protected abstract SmokeTestHandler when();
    protected abstract TestResult then();

    protected abstract void when(Map<String, Object> context);

    protected abstract TestResult then(Map<String, Object> context);

    public <R extends AbstractSmokeTest> R execute() {
        given().handle(context);
        when(context);
        this.result = then(context);
        return (R) this;
    }
}
