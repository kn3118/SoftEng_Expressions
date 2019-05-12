package ic.doc.co575;

public class Subtraction extends BinaryExpression {

  public Subtraction(Expression expr1, Expression expr2) {
    super(expr1, expr2);
    if (expr1.evaluate() - expr2.evaluate() <= 0) {
      throw new NonPositiveNumber();
    }
  }

  @Override
  public int evaluate() { return expr1.evaluate() - expr2.evaluate(); }

  @Override
  public String toString() {
    return "(" + expr1 + ")" + " - " + "(" + expr2 + ")";
  }
}
