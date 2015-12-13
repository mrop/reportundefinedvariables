package org.onehippo.reportundefinedvariables;

import org.onehippo.reportundefinedvariables.reporter.api.UndefinedVariableReporter;

/**
 * Created by mrop on 11/12/15.
 */
public abstract class AbstractUndefinedVariableReporter implements UndefinedVariableReporter {

    private UndefinedVariableReporter undefinedVariableReporter;

    private AbstractUndefinedVariableReporter(final UndefinedVariableReporter undefinedVariableReporter) {
        this.undefinedVariableReporter = undefinedVariableReporter;
    }

    public AbstractUndefinedVariableReporter() {
        this(null);
    }

    public void report(final String name){
        if (undefinedVariableReporter!=null){
            undefinedVariableReporter.report(name);
        }
    }
}
