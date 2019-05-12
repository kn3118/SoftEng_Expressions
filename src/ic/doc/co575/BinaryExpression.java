package ic.doc.co575;

public abstract class BinaryExpression extends AbstractExpression {

  final Expression expr1;
  final Expression expr2;

  public BinaryExpression(Expression expr1, Expression expr2) {
    this.expr1 = expr1;
    this.expr2 = expr2;
  }

  @Override
  public int depth() { return maxDepth(expr1, expr2) + 1; }

  private int maxDepth(Expression expr1, Expression expr2) {
    return (expr1.depth() > expr2.depth() ? expr1.depth() : expr2.depth());
  }

  public Expression getLeft() { return expr1; }

  public Expression getRight() { return expr2; }

}
