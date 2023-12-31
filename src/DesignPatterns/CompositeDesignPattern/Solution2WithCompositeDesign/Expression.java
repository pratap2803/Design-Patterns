package DesignPatterns.CompositeDesignPattern.Solution2WithCompositeDesign;

public class Expression implements ArthmeticExpression{
    ArthmeticExpression leftExpression;
    ArthmeticExpression rightExpression;
    Operation operation;

    public Expression(ArthmeticExpression leftPart, ArthmeticExpression rightPart, Operation operation){
        this.leftExpression = leftPart;
        this.rightExpression = rightPart;
        this.operation = operation;
    }
    @Override
    public int evaluate() {
        int value = 0;
        switch (operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBSTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }
        System.out.println("Expression value is :" + value);
        return value;
    }
}
