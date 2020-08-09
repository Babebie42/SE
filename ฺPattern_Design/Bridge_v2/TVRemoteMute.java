package bridge_v2;

public class TVRemoteMute extends RemoteButton
{
	public TVRemoteMute(EntertainmentDevice newDevice)
  {
		super(newDevice);
	}
	public void buttonNinePressed()
	{
		System.out.println("TV was Muted");
	}
}
