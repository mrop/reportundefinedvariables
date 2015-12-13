package org.onehippo.reportundefinedvariables.reporter;


import org.onehippo.reportundefinedvariables.ClassResolverLoggingELResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mrop on 11/12/15.
 */
public class LoggingUndefinedVariableReporter extends ClassResolverLoggingELResolver {

    static final Logger LOGGER = LoggerFactory.getLogger(LoggingUndefinedVariableReporter.class);

    @Override
    public void report(final String name) {
        LOGGER.info("Variable with name:{} is not defined, trying to look name on classpath");
        super.report(name);
    }
}
