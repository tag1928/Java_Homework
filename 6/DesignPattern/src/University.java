import java.util.ArrayList;
import java.util.List;

public class University
{
    private static University singleton = null;
    String name;
    boolean isGovernmentFunded;
    List <String> courses;

    private University()
    {
        name = "ZawgBridge";
        isGovernmentFunded = false;
        courses = new ArrayList <>();
        courses.addAll(List.of("Scamming", "Drug dealing", "Scamming year 2", "LooksMaxxing"));
    }

    public static University getInstance()
    {
        if (singleton == null)
            singleton = new University();
        return singleton;
    }
}