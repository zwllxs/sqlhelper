package com.jn.sqlhelper.dialect.expression;

import com.jn.langx.expression.value.StringExpression;

public class SymbolExpression extends StringExpression implements SQLExpression<String> {
    public SymbolExpression() {
    }

    public SymbolExpression(String value) {
        super(value);
    }
}