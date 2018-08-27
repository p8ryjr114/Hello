# Hello
// This code displays Hello-world with abstraction
// This commit adds onto the readme description

package hello;
import java.util.Scanner;
/**
 *
 * @author p8ryjr114
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HelloWater water = new HelloWater();
        HelloWeather weather = new HelloWeather();
        System.out.println(water.Show());
        System.out.println(weather.Show());
    }
    
}

abstract class HelloW{
abstract public String Show();
}
class HelloWater extends HelloW{

    @Override
    public String Show() {
        return("HelloWater");
    }

}
class HelloWeather extends HelloW{

    @Override
    public String Show() {
        return("HelloWeather");
    }

}
