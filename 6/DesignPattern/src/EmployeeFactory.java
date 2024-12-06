public class EmployeeFactory
{
    public static Employee getEmployee(String name,String surname, int privateNumber, int age , boolean isFullTime)
    {
        if (isFullTime)
            return new FullTime(name, surname, privateNumber, age);
        return new PartTime(name, surname, privateNumber, age);
    }
}