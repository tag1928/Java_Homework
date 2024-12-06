abstract public class Currency
{
    private String description;

    String getCurrencyDescription()
    {
        return description;
    }

    abstract double cost(double cost);
}