
import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args){
        float temperature;

        Scanner in=new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit");
        temperature =in.nextFloat();

        temperature=((temperature-32)*5/9);
        System.out.println("temperature in Celsius"+ temperature);
    }
}
