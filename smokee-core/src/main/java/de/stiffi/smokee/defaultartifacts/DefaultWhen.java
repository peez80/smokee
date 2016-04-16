package de.stiffi.smokee.defaultartifacts;

import de.stiffi.smokee.SmokeTestContext;
import de.stiffi.smokee.When;

import java.util.Map;

/**
 * Created by peez on 02.02.2016.
 */
public abstract class DefaultWhen implements When<Map<String, Object>, Map<String, Object>> {
    @Override
    public abstract Map<String, Object> when(SmokeTestContext context, Map<String, Object> given);
}
