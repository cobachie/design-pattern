import framework.*;
import idcard.*;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("野比のび太");
    Product card2 = factory.create("ドラえもん");
    Product card3 = factory.create("郷田剛");

    card1.use();
    card2.use();
    card3.use();
  }
}