package de.stiffi.smokee;

/**
 * Created by peez on 02.02.2016.
 */
public interface Then<G, W> {
    public TestResult then(SmokeTestContext context, G given, W when);
}
