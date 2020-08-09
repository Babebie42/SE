package bridge_v1;

public class Philips extends TV
{
  private Remote remoteType;

  public Philips(Remote r)
  {
    super(r);
    this.remoteType = r;
  }
  public void on()
  {
    System.out.print("Philips TV ON: ");
    remoteType.on();
  }
  public void off()
  {
    System.out.print("Philips TV OFF: ");
    remoteType.off();
  }
}
