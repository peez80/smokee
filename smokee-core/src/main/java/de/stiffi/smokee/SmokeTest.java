package de.stiffi.smokee;

/**
 * Created by peez on 02.02.2016.
 */
public class SmokeTest<G, W> {

    private Given<G> given;
    private When<G, W> when;
    private Then<G, W> then;

    private TestResult result;

    SmokeTestContext context = new SmokeTestContext();


    public <R extends SmokeTest<G, W>> R given(Given<G> given) {
        if (this.given != null) {
            throw new IllegalStateException("Given already set");
        }
        this.given = given;
        return (R) this;
    }

    public <R extends SmokeTest<G, W>> R when(When<G, W> when) {
        if (this.when != null) {
            throw new IllegalStateException("When already set");
        }
        this.when = when;
        return (R) this;
    }

    public <R extends SmokeTest<G, W>> R then(Then<G, W> then) {
        if (this.then != null) {
            throw new IllegalStateException("Then already set");
        }
        this.then = then;
        return (R) this;
    }

    public <R extends SmokeTest<G, W>> R execute() {
        String step = "";
        try {
            step = "given";
            G given = this.given != null ? this.given.given(context) : null;

            step = "when";
            W when = this.when != null ? this.when.when(context, given) : null;

            step = "then";
            result = this.then != null ? this.then.then(context, given, when) : null;
        }catch(Exception e) {
            result = new TestResult(false, "Exception in " + step + ". \r\n");
        }

            return (R) this;
    }

    public <R extends SmokeTest<G, W>> R context(String key, Object value) {
        context.put(key, value);
        return (R) this;
    }

    public TestResult getResult() {
        return result;
    }
}
