package fop.w9temp;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * გამოიყენეთ ეს კლასი და დააიმპლემენტეთ აბსტრაქტული მეთოდები
 */
public class Streams extends Temperatures
{
    public Streams()
    {
        super("src/fop/w9temp/temps.csv");
    }

    /**
     * გამოიყენეთ ეს მეთოდი დასატესტად
     */
    public static void main(String[] args)
    {
        Streams streams = new Streams();
        streams.printSummary();
    }

    /**
     * გამოიყენეთ stream() მეთოდი და დააბრუნეთ სტრიმის ზომა
     */
    public long size()
    {
        return stream().count();
    }

    /**
     * გამოიყენეთ stream() მეთოდი და დააბრუნეთ ტემპერატურის ელემენტების უნიკალური date ატრიბუტების ლისტი
     */
    public List <LocalDate> dates()
    {
        return stream().map(obj -> obj.getDate()).distinct().toList();
    }

    /**
     * გამოიყენეთ stream() მეთოდი და დააბრუნეთ ტემპერატურის ელემენტების city ატრიბუტების სეტი
     */
    public Set <String> cities()
    {
        return stream().map(obj -> obj.getCity()).collect(Collectors.toSet());
    }

    /**
     * გამოიყენეთ stream() მეთოდი და დააბრუნეთ ტემპერატურის ელემენტების country ატრიბუტების სეტი
     */
    public Set <String> countries()
    {
        return stream().map(obj -> obj.getCountry()).collect(Collectors.toSet());
    }

    /**
     * გამოიყენეთ stream() მეთოდი და დააბრუნეთ ქვეყნის სახელი, სადაც დაფიქსირებულია ყველაზე ცივი ტემპერატურა
     */
    public String coldestCountry()
    {
        return stream().min((o1, o2) -> (int) o1.getTemperature() - (int) o2.getTemperature()).get().getCountry();
    }

    /**
     * გამოიყენეთ stream() მეთოდი და დააბრუნეთ ქვეყნის სახელი, სადაც დაფიქსირებულია ყველაზე ცხელი ტემპერატურა
     */
    public String hottestCountry()
    {
        return stream().min((o1, o2) -> (int) o2.getTemperature() - (int) o1.getTemperature()).get().getCountry();
    }

    /**
     * გამოიყენეთ stream() მეთოდი და დააბრუნეთ მეპი სადაც key იქნება ქვეყნის სახელი
     * და value იქნება ამ ქვეყნის ტემპერატურების ლისტი
     */
    public Map <String, List <Double>> temperaturesByCountry()
    {
        return new HashMap <>();
    }
    //mas, am methods ar xmarobt mainc

    /**
     * გამოიყენეთ stream() მეთოდი და დააბრუნეთ მეპი სადაც key იქნება ქვეყნის სახელი
     * და value იქნება ამ ქვეყნის ტემპერატურების საშუალო არითმეტიკული
     */
    public Map <String, Double> countriesAvgTemperature()
    {
        return stream().distinct().collect(Collectors.toMap(obj -> obj.getCountry(), Temperature::getTemperature));
    }
}
