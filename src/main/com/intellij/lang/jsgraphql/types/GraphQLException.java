package com.intellij.lang.jsgraphql.types;


@Internal
public class GraphQLException extends RuntimeException {

    public GraphQLException() {
    }

    public GraphQLException(String message) {
        super(message);
    }

    public GraphQLException(String message, Throwable cause) {
        super(message, cause);
    }

    public GraphQLException(Throwable cause) {
        super(cause);
    }

}