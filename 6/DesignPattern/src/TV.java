public class TV implements Device
{
    boolean isOn = true;
    int volume = 50;
    int channel = 1;

    @Override
    public boolean isEnabled()
    {
        return isOn;
    }

    @Override
    public void disable()
    {
        isOn = false;
    }

    @Override
    public int getVolume()
    {
        return volume;
    }

    @Override
    public void setVolume(int percent)
    {
        volume = percent;
    }

    @Override
    public int getChannel()
    {
        return channel;
    }

    @Override
    public void setChannel(int channel)
    {
        this.channel = channel;
    }

    @Override
    public void printStatus()
    {
        System.out.println("Tv is on: " + isOn + "\nVolume: " + volume + "\nChannel: " + channel);
    }
}