package ic.doc.co575;

public abstract class AbstractExpression implements Expression {

  @Override
  public int compareTo(Expression other) {
    if (this.evaluate() > other.evaluate()) {
      return 1;
    } else if (this.evaluate() < other.evaluate()) {
      return -1;
    }
    return 0;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Expression) {
      return this.compareTo((Expression) o) == 0;
    }
    return false;
  }

}
