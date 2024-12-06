import java.util.ArrayList;
import java.util.List;

public class Main5
{
    public static void main(String[] args)
    {
        ArrayList <Subscriber> subscribers = new ArrayList <>(List.of(new Subscriber("Jimmy"), new Subscriber("Zimmy"), new Subscriber("Timmy")));

        Blog scam = new Blog(subscribers);
        scam.article = "How to generate free energy!";

        Blog ramsey = new Blog(subscribers);
        ramsey.article = "How to cook";
    }
}