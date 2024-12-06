public class BasicRemote implements Remote
{
    Device device;
    @Override
    public void power()
    {
        if (device.isEnabled())
            device.disable();
    }

    @Override
    public void volumeUp()
    {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown()
    {
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void channelUp()
    {
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown()
    {
        device.setChannel(device.getChannel() - 1);
    }
}