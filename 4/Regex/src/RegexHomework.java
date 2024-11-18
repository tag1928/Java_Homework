import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHomework
{
    /**
     * გაუშვით main მეთოდი თქვენი კოდის დასატესტად. თუ ქართული ასოების შეცდომა გამოვა, სცადეთ ხელახლა სანამ არ გასწორდება.
     */
    public static void main(String[] args)
    {
        List <String> numbers = matchNumbers("abcd123efgh4567");
        assert numbers.size() == 2;
        assert numbers.get(0).equals("123");
        assert numbers.get(1).equals("4567");
        List <String> chars = matchCharsWithVowels("abcd123efghi45jklm67");
        assert chars.size() == 2;
        assert chars.get(0).equals("abcd");
        assert chars.get(1).equals("efgh");
//        assert matchIp("127.0.0.10");
//        assert matchIp("192.168.0.255");
//        assert !matchIp("192.168.0.256");
//        assert !matchIp("300.168.0.256");
//        assert !matchIp("192.168.0.255.1");
        assert matchEmail("saba.zedginidze@mziuri.ge");
        assert !matchEmail("saba.zedginidze@mziuri");
        assert !matchEmail("saba.zedg.inidze@mziuri.ge");
        assert !matchEmail("saba.2003@mziuri.ge");
        assert matchPhone("+995 555-123-456");
        assert !matchPhone("+995 555-123-4567");
        assert !matchPhone("+995 555-1234-456");
        assert !matchPhone("555-123-456-789");
    }

    /**
     * დაწერეთ regex რომელიც დააბრუნებს მხოლოდ გადაცემული string-ში მიმდევრობით არსებულ ციფრებს
     */
    private static List <String> matchNumbers(String s)
    {
        List <String> tmp = new ArrayList <>();
        tmp = Arrays.stream(s.split("[0-9]{2,}")).toList();

        return tmp;
    }

    /**
     * დაწერეთ regex რომელიც დააბრუნებს ისეთ ასოების მიმდევრობებს, რომელიც იწყება ხმოვნებით
     */
    private static List <String> matchCharsWithVowels(String s)
    {
        return Arrays.stream(s.split("[aeiou]\\w+")).toList();
    }

    /**
     * დაწერეთ regex რომელიც დაბეჭდავს true/false-ს - არის თუ არა მოცემული string ვალიდური ip მისამართი (ფორმატი: x.x.x.x, სადაც 0 <= x <= 255)
     */
    private static boolean matchIp(String s)
    {
        Pattern p = Pattern.compile("");
        Matcher matcher = p.matcher(s);

        return matcher.matches();

        //ver gavakete;
    }

    /**
     * დაწერეთ იმეილის regex შემდეგი ფორმატით: saxeli.gvari@mziuri.ge
     */
    private static boolean matchEmail(String s)
    {
        Pattern p = Pattern.compile("(\\w+)\\.(\\w+)\\@(mziuri\\.ge)");
        Matcher matcher = p.matcher(s);
        return matcher.matches();
    }

    /**
     * დაწერეთ ტელეფონის ნომერის რეგექსი ფორმატით: +995 5xx-xxx-xxx, სადაც 0 <= x <= 9
     */
    private static boolean matchPhone(String s)
    {
        Pattern p = Pattern.compile("^\\+995 5(\\d{2})(\\-\\d{3}){2}$");
        Matcher matcher = p.matcher(s);

        return matcher.matches();
    }
}