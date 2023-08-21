package Project_rishi;


    import java.util.Scanner;

public class TemperatureConverter 
{

    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in))
         {
            System.out.println("Welcome to the Temperature Converter!");

            while (true)
             {
                System.out.println("\nSelect an option:");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                System.out.println("3. Celsius to Kelvin");
                System.out.println("4. Quit");
                System.out.print("Enter your choice: ");

                int choice = input.nextInt();

                if (choice == 4) {
                    System.out.println("Goodbye!");
                    break;
                }

                System.out.print("Enter the temperature: ");
                double temperature = input.nextDouble();

                switch (choice) 
                {
                    case 1:
                        convertCelsiusToFahrenheit(temperature);
                        break;
                    case 2:
                        convertFahrenheitToCelsius(temperature);
                        break;
                    case 3:
                        convertCelsiusToKelvin(temperature);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }

    public static void convertCelsiusToFahrenheit(double celsius) 
    {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " °C is equal to " + fahrenheit + " °F");
    }

    public static void convertFahrenheitToCelsius(double fahrenheit) 
    {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " °F is equal to " + celsius + " °C");
    }

    public static void convertCelsiusToKelvin(double celsius) 
    {
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " °C is equal to " + kelvin + " K");
    }
}

    

