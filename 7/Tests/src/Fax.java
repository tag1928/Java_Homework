public class Fax
{
    public static int factorial(int input) throws IllegalArgumentException
    {
        if (input < 0) throw new IllegalArgumentException("Cannot take a factorial of a negative number");
        if (input == 0) return 1;
        if (input == 1) return 1;

        return factorial(input - 1) * input;
    }
}