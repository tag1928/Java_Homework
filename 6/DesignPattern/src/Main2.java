public class Main2
{
    public static void main(String[] args)
    {
        FullTime Schmidt = (FullTime) EmployeeFactory.getEmployee("John", "Schmidt", 4756, 67, true);
        PartTime Sheldon = (PartTime) EmployeeFactory.getEmployee("Young", "Sheldon", 12345, 6, false);

        Schmidt.salary = 9999.99;
        Sheldon.wage = 10.99;
        Sheldon.daysWorked = 7;

        System.out.println(Schmidt);
        System.out.println(Sheldon);
    }
}