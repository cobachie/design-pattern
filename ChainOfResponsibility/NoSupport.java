public class NoSupport extends Support {
  public NoSupport(String number) {
    super(number);
  }

  protected boolean resolve(Trouble trouble) {
    return false;
  }
}