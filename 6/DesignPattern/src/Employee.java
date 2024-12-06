public abstract class Employee
{
    abstract double getSalary();

    String name;
    String surname;
    int privateNumber;
    int age;

    public String toString()
    {
        return "Name: " + name + "\nSurname: " + surname + "\nPrivate number: " + privateNumber + "\nAge : " + age + "\nSalary: " + getSalary();
    }
}