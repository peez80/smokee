package de.stiffi.smokee;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by peez on 02.02.2016.
 */
public class SmokeTestContext {
    private Map<String,  Object> context = new HashMap<>();

    public void put(String key, Object value) {
        context.put(key, value);
    }

    public Object get(String key) {
        return context.get(key);
    }
}
