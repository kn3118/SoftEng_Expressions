package ic.doc.co575;

import java.util.Arrays;

public class ExpressionArrayFactory {

  public static Expression[] randomExpressionArray(int maxSize, int maxDepth) {

    Expression[] array = new Expression[maxSize];
    for (int i = 0; i < maxSize; i++) {
      array[i] = ExpressionFactory.randomExpression(maxDepth);
    }
    Arrays.sort(array);
    return array;
  }

}
