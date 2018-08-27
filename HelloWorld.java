                    # Hello
                    // This code displays Hello-world with abstraction
                    // This commit adds onto the readme description

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        HelloWind wind = new HelloWind();
        System.out.println("You see some water and say " + water.Show());
        System.out.println("You feel the wind and shout " + wind.Show() + "!!");
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
class HelloWind extends HelloW{

    @Override
    public String Show() {
        return("HelloWind");
    }

}
