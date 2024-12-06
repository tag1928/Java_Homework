import java.util.ArrayList;

public class Blog
{
    String article;
    ArrayList<Subscriber> subscribersList;

    public Blog(ArrayList<Subscriber> list)
    {
        subscribersList = list;
        for (Subscriber x : subscribersList)
        {
            x.update();
        }
    }
}