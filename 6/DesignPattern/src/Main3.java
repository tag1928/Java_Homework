public class Main3
{
    public static void main(String[] args)
    {
        TV LGTV = new TV();
        Radio radium = new Radio();

        BasicRemote remote = new BasicRemote();
        AdvancedRemote advancedRemote = new AdvancedRemote();

        remote.device = LGTV;
        advancedRemote.device = radium;

        remote.device.printStatus();
        System.out.println();
        advancedRemote.device.printStatus();
        System.out.println();

        remote.channelUp();
        advancedRemote.channelUp();

        remote.device.printStatus();
        System.out.println();
        advancedRemote.device.printStatus();
        System.out.println();

        remote.power();
        advancedRemote.power();

        LGTV.printStatus();
        System.out.println();
        radium.printStatus();
        System.out.println();

        remote.device = radium;
        advancedRemote.device = LGTV;

        remote.device.printStatus();
        System.out.println();
        advancedRemote.device.printStatus();
        System.out.println();
    }
}