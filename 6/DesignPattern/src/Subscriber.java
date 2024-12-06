public class Subscriber
{
    String name;

    public Subscriber(String name)
    {
        this.name = name;
    }

    void update()
    {
        System.out.println(name + " has been updated by a blog");
    }
}