public class Main
{
    static class Math
    {
        static int fibonacci(int index)
        {
            if (index <= 2) return index;

            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(Math.fibonacci(6));
    }
}