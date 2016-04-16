package de.stiffi.smokee;

/**
 * Created by peez on 02.02.2016.
 */
public class TestResult {
    boolean passed;
    String message;

    public TestResult(boolean passed, String message) {
        this.passed = passed;
        this.message = message;
    }

    public boolean isPassed() {
        return passed;
    }

    public String getMessage() {
        return message;
    }
}
