package ic.doc.co575;

import java.util.Random;

public class ExpressionFactory {

  public static Expression randomExpression(int maxDepth) {
    Random ran = new Random();
    if (maxDepth < 1) {
      int number = ran.nextInt(9) + 1;
      return new NaturalNumber(number);
    }
    int operator = ran.nextInt(4);
    int ldepth = ran.nextInt(maxDepth);
    int rdepth = ran.nextInt(maxDepth);
    Expression expr1 = randomExpression(ldepth);
    Expression expr2 = randomExpression(rdepth);
    Expression total = null;
    try {
      switch (operator) {
        case 0: {
          total = new Addition(expr1, expr2);
          break;
        }
        case 1: {
          total = new Product(expr1, expr2);
          break;
        }
        case 2: {
          total = new Subtraction(expr1, expr2);
          break;
        }
        case 3: {
          total = new Division(expr1, expr2);
          break;
        }
        default:
          break;
      }
    } catch (InvalidNaturalNumber e) {
      System.out.println(e);
      operator = ran.nextInt(2);
      if (operator == 0) {
        total = new Addition(expr1, expr2);
      } else {
        total = new Product(expr1, expr2);
      }
    }
    return total;
  }

}
