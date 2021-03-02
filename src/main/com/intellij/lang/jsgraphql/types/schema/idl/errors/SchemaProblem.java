package com.intellij.lang.jsgraphql.types.schema.idl.errors;

import com.intellij.lang.jsgraphql.types.GraphQLError;
import com.intellij.lang.jsgraphql.types.GraphQLException;
import com.intellij.lang.jsgraphql.types.Internal;
import com.intellij.lang.jsgraphql.types.schema.idl.SchemaParser;

import java.util.ArrayList;
import java.util.List;

/**
 * A number of problems can occur when using the schema tools like {@link SchemaParser}
 * or {@link com.intellij.lang.jsgraphql.types.schema.idl.SchemaGenerator} classes and they are reported via this
 * exception as a list of {@link GraphQLError}s
 */
@Internal
public class SchemaProblem extends GraphQLException {

    private final List<GraphQLError> errors;

    public SchemaProblem(List<GraphQLError> errors) {
        this.errors = new ArrayList<>(errors);
    }

    @Override
    public String getMessage() {
        return "errors=" + errors;
    }

    public List<GraphQLError> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "SchemaProblem{" +
                "errors=" + errors +
                '}';
    }
}