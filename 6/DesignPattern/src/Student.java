public class Student
{
    final String name;
    final String surname;
    final int privateNumber;
    int age;

    University university = University.getInstance();

    public Student(String name, String surname, int privateNumber, int age)
    {
        this.name = name;
        this.surname = surname;
        this.privateNumber = privateNumber;
        this.age = age;
    }

    public String toString()
    {
        return "Name: " + name +
            "\nSurname: " + surname +
            "\nPrivate number: " + privateNumber +
            "\nAge: " + age;
    }
}