package de.stiffi.smokee.defaultartifacts;

import de.stiffi.smokee.Given;
import de.stiffi.smokee.SmokeTestContext;

import java.util.Map;

/**
 * Created by peez on 02.02.2016.
 */
public abstract class DefaultGiven implements Given<Map<String, Object>> {
    @Override
    public abstract Map<String, Object> given(SmokeTestContext context);
}
