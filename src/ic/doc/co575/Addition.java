package ic.doc.co575;

public class Addition extends BinaryExpression {

  public Addition(Expression expr1, Expression expr2) {
    super(expr1, expr2);
  }

  @Override
  public int evaluate() { return expr1.evaluate() + expr2.evaluate(); }

  @Override
  public String toString() {
    return "(" + expr1 + ")" + " + " + "(" + expr2 + ")";
  }

}
