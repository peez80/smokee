package de.stiffi.smokee.defaultartifacts;

import de.stiffi.smokee.SmokeTestContext;
import de.stiffi.smokee.TestResult;
import de.stiffi.smokee.Then;

import java.util.Map;

/**
 * Created by peez on 02.02.2016.
 */
public abstract class DefaultThen implements Then<Map<String, Object>, Map<String, Object>> {
    @Override
    public abstract TestResult then(SmokeTestContext context, Map<String, Object> given, Map<String, Object> when);
}
