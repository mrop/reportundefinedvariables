package org.onehippo.reportundefinedvariables.reporter.api;

/**
 * Created by mrop on 11/12/15.
 */
public interface UndefinedVariableReporter {

    /**
     * @param name the name of the variable that is undefined
     */
    void report(String name);
}
