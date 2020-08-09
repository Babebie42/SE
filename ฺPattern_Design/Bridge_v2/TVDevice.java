package bridge_v2;

public class TVDevice extends EntertainmentDevice
{

	public TVDevice(int newDeviceState, int newMaxSetting)
	{
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}
	public void buttonFivePressed()
	{
		System.out.println("Channel Down");
		deviceState--;
	}
	public void buttonSixPressed()
	{
		System.out.println("Channel Up");
		deviceState++;
	}
}
