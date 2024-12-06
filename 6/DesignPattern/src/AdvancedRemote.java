public class AdvancedRemote extends BasicRemote
{
    public void mute()
    {
        device.setVolume(0);
    }
}