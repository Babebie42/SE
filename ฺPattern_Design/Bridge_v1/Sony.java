package bridge_v1;

public class Sony extends TV
{
  private Remote remoteType;

  public Sony(Remote r)
  {
    super(r);
    this.remoteType = r;
  }
  public void on()
  {
    System.out.print("Sony TV ON: ");
    remoteType.on();
  }
  public void off()
  {
    System.out.print("Sony TV OFF: ");
    remoteType.off();
  }
}
