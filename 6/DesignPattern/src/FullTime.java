public class FullTime extends Employee
{
    double salary;
    @Override
    double getSalary()
    {
        return salary;
    }

    public FullTime(String name, String surname, int privateNumber, int age)
    {
        this.name = name;
        this.surname = surname;
        this.privateNumber = privateNumber;
        this.age = age;
    }
}