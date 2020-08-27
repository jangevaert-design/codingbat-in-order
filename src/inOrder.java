public class inOrder {
  public boolean inOrder(int a, int b, int c, boolean bOk) {
    return ((b > a && c > b && !bOk) || (c > b && bOk));
  }
}
