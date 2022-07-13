package dev.webfx.stack.orm.expression.builder.terms;

import dev.webfx.stack.orm.expression.Expression;
import dev.webfx.stack.orm.expression.terms.Equals;

/**
 * @author Bruno Salmon
 */
public final class EqualsBuilder extends BinaryBooleanExpressionBuilder {

    public EqualsBuilder(ExpressionBuilder left, ExpressionBuilder right) {
        super(left, right);
    }

    @Override
    protected Equals newBinaryOperation(Expression left, Expression right) {
        return new Equals(left, right);
    }
}
