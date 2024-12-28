import java.sql.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final String URL = "jdbc:postgresql://localhost:5432/Test_JDBC";
        final String USER = "postgres";
        final String PASSWORD = "donpollo";

        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD))
        {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP TABLE IF EXISTS \"Person\"");
            statement.executeUpdate("CREATE TABLE \"Person\"" +
                "(" +
                "\"ID\" SERIAL," +
                "\"Name\" VARCHAR(20)," +
                "\"Surname\" VARCHAR(30)," +
                "\"Age\" INTEGER," +
                "\"Gender\" VARCHAR(10)" +
                ")");
            PreparedStatement pStatement = connection.prepareStatement("INSERT INTO \"Person\"(\"Name\", \"Surname\", \"Age\", \"Gender\") VALUES (?, ?, ?, ?)");
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 3; i++)
            {
                System.out.println("Person " + i);
                System.out.println("Name: ");
                pStatement.setString(1, scanner.nextLine());
                System.out.println("Surname: ");
                pStatement.setString(2, scanner.nextLine());
                System.out.println("Age: ");
                pStatement.setInt(3, scanner.nextInt());
                System.out.println("Gender: ");
                scanner.nextLine();
                pStatement.setString(4, scanner.nextLine());
                pStatement.executeUpdate();
            }

            var query = statement.executeQuery("SELECT * FROM \"Person\"");

            while (query.next())
            {
                System.out.println(query.getInt(1) + " " + query.getString(2) + " " + query.getString(3) + " " + query.getInt(4) + " " + query.getString(5));
            }

            statement.executeUpdate("UPDATE \"Person\" SET \"Age\" = \"Age\" + 1");

            query = statement.executeQuery("SELECT * FROM \"Person\" WHERE \"Age\" > 10");

            System.out.println();
            while (query.next())
            {
                System.out.println(query.getInt(1) + " " + query.getString(2) + " " + query.getString(3) + " " + query.getInt(4) + " " + query.getString(5));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}