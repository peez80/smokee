package de.stiffi.smokee;

/**
 * Created by peez on 02.02.2016.
 */
public interface When<G, W> {
    public W when(SmokeTestContext context, G given);
}
