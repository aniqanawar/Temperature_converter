
package temperature_converter;

/**
 *
 * @author aniqanawar
 */
import java.util.Scanner;
public class Temperature_converter {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     double celcius, fahrenheit;
     System.out.print("Enter a temperature in Celcius: ");
		celcius = keyboard.nextInt();

		fahrenheit = (9 / 5) * celcius + 32;

		System.out.println("The equivalent temperature in Fahrenheit is: " +
			fahrenheit);
    
    }
    
}
