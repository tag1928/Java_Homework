public class PartTime extends Employee
{
    int daysWorked = 0;
    double wage;

    @Override
    double getSalary()
    {
        return daysWorked * wage;
    }

    public PartTime(String name, String surname, int privateNumber, int age)
    {
        this.name = name;
        this.surname = surname;
        this.privateNumber = privateNumber;
        this.age = age;
    }
}