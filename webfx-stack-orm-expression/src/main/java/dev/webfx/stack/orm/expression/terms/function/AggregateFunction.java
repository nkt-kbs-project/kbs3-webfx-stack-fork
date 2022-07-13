package dev.webfx.stack.orm.expression.terms.function;

import dev.webfx.stack.orm.expression.Expression;
import dev.webfx.stack.orm.expression.lci.DomainReader;
import dev.webfx.extras.type.Type;

/**
 * @author Bruno Salmon
 */
public abstract class AggregateFunction<T> extends Function<T> {

    public AggregateFunction(String name) {
        super(name);
    }

    public AggregateFunction(String name, Type returnType) {
        super(name, returnType);
    }

    public AggregateFunction(String name, String[] argNames, Type[] argTypes, Type returnType) {
        super(name, argNames, argTypes, returnType);
    }

    public AggregateFunction(String name, String[] argNames, Type[] argTypes, Type returnType, boolean evaluable) {
        super(name, argNames, argTypes, returnType, evaluable);
    }

    public abstract Object evaluateOnAggregates(T referrer, Object[] aggregates, Expression<T> operand, DomainReader<T> domainReader);

}
